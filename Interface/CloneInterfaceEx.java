
import java.lang.Cloneable;/**
 * A Implements Cloneable
 */
class CloneClass implements Cloneable {

    String sc;
    CloneClass(String sc){
        this.sc = sc;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class CloneInterfaceEx {
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneClass a = new CloneClass("joy");
        CloneClass b = (CloneClass)a.clone();
        System.out.println("It's Pure " + b.sc + " !");
    }
}
