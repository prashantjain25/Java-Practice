package scratchPad;
interface T1{
    int VALUE = 1;
    void m1();
 }
 interface T2{
    int VALUE = 2;
    int m1();
 }
abstract class Abcx{
    int x=10;
    Abcx(int a){
        
    }
    public abstract void display() ;
}
public class OveridingFinalConcept extends Abcx implements T1 {
        int x=20;
         OveridingFinalConcept(int a) {
                super(a);        }
 
         public void display() {
            System.out.println(x);
        }
        public static void main(String[] arg) {
            Abcx disp=new OveridingFinalConcept(10);
            disp.display();
            Thread[] n=new Thread[5];
            
        }

        public void m1() {
            
        }


}
