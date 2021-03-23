public class DeadlockThread {
    public static void main(String[] args) {
        final String res1 = "Hello Beta";
        final String res2 = "How are you?";

        Thread t1 = new Thread(){
            public void run(){
                synchronized(res1){
                    System.out.println("Thread 1 locked Res 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    synchronized(res2){
                        System.out.println("Thread 1 locked Res 2");
                    }
                }
                
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized(res2){
                    System.out.println("Thread 2 locked Res 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    synchronized(res1){
                        System.out.println("Thread 2 locked Res 1");
                    }
                }
                
            }
        };

        t1.start();
        t2.start();
    }
}
