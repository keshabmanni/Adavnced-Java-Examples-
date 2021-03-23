
class CFirst{
    public void display(String msg){
        System.out.println("["+msg);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class CSecond extends Thread{
    String msg;
    CFirst fobj;
    CSecond(CFirst fp, String str){
        fobj = fp;
        msg = str;
    }
    public void run(){
        synchronized(fobj){
            fobj.display(msg);
        }
    }
}
public class SynchronizationThread {
    public static void main(String[] args) {
        CFirst cf = new CFirst();

        CSecond cs1 = new CSecond(cf, "Hello");
        CSecond cs2 = new CSecond(cf, "Kesu");
        CSecond cs3 = new CSecond(cf, "Byee");

        cs1.start();
        cs2.start();
        cs3.start();
    }    
}
