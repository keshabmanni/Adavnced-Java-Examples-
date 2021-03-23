class Gene{
    private double val;
    <T extends Number> Gene(T ob){
        val = ob.doubleValue();
    }
    void show(){
        System.out.println(val);
    }
}
class GenericConstructor {
    public static void main(String[] args) {
        Gene g1 = new Gene(100);
        Gene g2 = new Gene(121.3f);
        g1.show();
        g2.show();
    }
}
