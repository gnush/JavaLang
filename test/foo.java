public class A{
    private int field;
    
    public A(){
        field = 0;
    }
    
    public A(int field){
        this.field = field;
    }
    
    public int getField(Obj o){
        new A().field;
        A a = new A();
        a.field;
        return o.field;
    }
}