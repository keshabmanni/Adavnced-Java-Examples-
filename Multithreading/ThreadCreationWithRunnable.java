

public class ThreadCreationWithRunnable implements Runnable{
    public void run(){
        System.out.println("Thread creation by implementing runnable");
    }

    public static void main(String[] args) {
            ThreadCreationWithRunnable tcr = new ThreadCreationWithRunnable();
            new Thread(tcr).start();
    }
}
