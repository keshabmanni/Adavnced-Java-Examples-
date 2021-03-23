

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThreadClassPriority mtc1 = new MyThreadClassPriority();
        MyThreadClassPriority mtc2 = new MyThreadClassPriority();

        mtc1.setName("Thread A");
        mtc2.setName("Thread B");

        //mtc1.setPriority(Thread.MIN_PRIORITY);
        //mtc2.setPriority(Thread.MAX_PRIORITY);

        mtc1.setDaemon(true);
        
        mtc1.start();
        mtc2.start();
    }
}
