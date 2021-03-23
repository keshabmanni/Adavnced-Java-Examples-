class CGenerics<Typ> {
    Typ tobj;
    CGenerics(Typ tobj){
        this.tobj = tobj;
    }
    public Typ getObj(){
        return tobj;
    }
}

class GenericClass{
    public static void main(String[] args) {
        CGenerics<Integer> iobj = new CGenerics<>(1000);
        int x = iobj.getObj();
        System.out.println(x);

        CGenerics<String> sobj = new CGenerics<>("hello");
        String str = sobj.getObj();
        System.out.println(str);
    }
}
