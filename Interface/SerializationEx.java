
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class X implements Serializable{
    String s;
    int i;
    X(String s, int i){
        this.s = s;
        this.i = i;
    }
    void show(){
        System.out.println(s + " got "+ i);
    }
}

public class SerializationEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        // srialization
        X x = new X("Kody", 10);
        FileOutputStream fos = new FileOutputStream("Interface/xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(x);

        //De-serialization
        FileInputStream fis = new FileInputStream("Interface/xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        X y = (X)ois.readObject();
        y.show();

        oos.close();
        ois.close();

    }
}
