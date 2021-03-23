

class ThreadCreationWithThread extends Thread{
    public void run(){
        System.out.println("Thread creation by extending thread");
    }
    public static void main(String[] args) {
        ThreadCreationWithThread ct = new ThreadCreationWithThread();
        ct.start();
    }
}
