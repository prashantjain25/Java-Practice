package scratchPad;


interface myInterface{
    public int x=10;
    abstract int myMethod(int x, int y);
    //abstract int jn(int c, int d);
}
interface expectedInterface{
    default void display() {
        System.out.println("diasplay 1");
    }
    default void display2() {
        System.out.println("display 2");
    }
    void check(int a);
}
public class Lambda {

    public static void main(String[] ar) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        };
        myInterface myInt=(x,y)->{
            return x+y;
        };
       System.out.println(myInt.myMethod(10, 20));  
       
       myInterface my=(x,y)-> {return x+y;};
        
       expectedInterface ex=a->System.out.print(a);
       ex.display();
    }
}
