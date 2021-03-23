package InterThreadCommunication;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerProblem {

    public static void main(String[] args) {
        System.out.println("How to use wait() and notify() method in java.");
        System.out.println("Solving Consumer Producer Problem");

        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread consumer = new Consumer(buffer, maxSize, "Consumer");

        producer.start();
        consumer.start();
    }    

    
}

class Producer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;
    Producer(Queue<Integer> queue, int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while(true){
            synchronized(queue){
                while(queue.size() == maxSize){
                    try {
                        System.out.println("Queue is Full!!"+ " Producer thread waiting for "+"consumer to take something from queue");
                        queue.wait();
                    } catch (Exception e) {
                        //TODO: handle exception
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value: "+i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

class Consumer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while(true){
            synchronized(queue){
                while(queue.isEmpty()){
                    System.out.println("Queue is Empty, " +"Consumer thread is waiting "+"for producer thread to put something in queue");
                    try {
                        queue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                        //TODO: handle exception
                    }
                }
                System.out.println("COnsuming value : "+queue.remove());
                queue.notifyAll();
            }
        }
    }
}