
interface IMethodsA{

    // override compulsory
    void hello();

    // override optional
    default void message(String s){
        System.out.println("Default Method Message is "+s);
    }

    // no overide permitted
    static void show(){
        System.out.println("Static Method");
    }
}

class CMethodsA implements IMethodsA{
    public void hello(){
        System.out.println("Hello");
    }
    public void message(String s) {
        
        System.out.println("Message is "+s);
    }
    
}

class CMethodsB implements IMethodsA{
    public void hello(){
        System.out.println("Hello");
    }
}

public class MethodsOfInterfaceEx {
    public static void main(String[] args) {
        // Overiding default method 
        CMethodsA oa = new CMethodsA();
        oa.message("hello sir");

        // Falling to default method when not overidden in class
        CMethodsB ob = new CMethodsB();
        ob.message("hello sir");        

        // Calling Static Interface methid
        // no object creation needed
        IMethodsA.show();
    }   
}
