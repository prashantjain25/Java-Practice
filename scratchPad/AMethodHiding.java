package scratchPad;
class b{
    b(int x){
        
    }
    public static int beta() {
        System.out.println("beta");
        return 0;
    }
}
public class AMethodHiding extends b{
    public AMethodHiding(int a) {
        super(1);
    }
public static void main(String[] ar) {
    AMethodHiding neww=new AMethodHiding(1);
    b h=new b(1);
    b mm=new AMethodHiding(1);
    System.out.println(mm.beta());
}
public static int beta(){
    try {
        return 1;
    }
    catch(Exception e) {
        
    }
    finally {
        System.out.println("hello");
    }
    return 0;
}
}
