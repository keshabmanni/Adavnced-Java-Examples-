// file for Thread lifecycle class

public class MyThreadClassPriority extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread Name is : "+Thread.currentThread().getName()+" value : "+i+" Priority: "+Thread.currentThread().getPriority()+" ID : "+Thread.currentThread().getId()+" Deamon : "+Thread.currentThread().isDaemon());
            /*
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            */
        }
    }   
}