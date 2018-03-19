package scratchPad;

public class InnerClassExample {
    
    public static void main(String[] arm) {
	final  int x=0;
	class InnerClass{
	    //int x=99;
		   void display() {
		       System.out.println(x); //use is possible not reassignment
		   }
		}
    }
}
