public class A{
    private int field;
    
    public A(){
        field = 0;
    }
    
    public A(int field){
        this.field = field;
    }
    
    public int getField(Obj o){
        return o.field;
    }
}