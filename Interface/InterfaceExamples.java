
interface A{
    void showMe();
}

interface B {
    void welcome(String s);
}

/* 
multiple inheritence only possible in interface,
not in class
*/
class C implements A, B{
    public void showMe(){
        System.out.println("It's interface implementation");
    }
    public void welcome(String c){
        System.out.println(c);
    }
}

class InterfaceExamples{

    public static void main(String[] args){
        // System.out.println("Hii");
        C c = new C();
        c.welcome("Hello welcome here");
        c.showMe();        
    }
}