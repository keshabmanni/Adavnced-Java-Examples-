
interface IDeletable{}
class CDelete{
    boolean delete(Object obj){
        if(obj instanceof IDeletable){
            System.out.println("Object "+obj+" is Deletable!!");
            return true;
        }
        System.out.println("Object "+obj+" is Not Deletable!!");
        return false;
    }
}
class Master extends CDelete{}

class Slave extends CDelete implements IDeletable{}

public class MarkerInterfaceEx {
    public static void main(String[] args) {
        Master ms = new Master();
        ms.delete(ms);

        Slave ss = new Slave();
        ss.delete(ss);
    }
    
}