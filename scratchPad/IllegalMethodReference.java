package scratchPad;

public class IllegalMethodReference {
    public static void main(String[] args) {
        Book o1 = new Encyclopedia (); //3
        Book o2 = new Book();
        o1.mA(); //4
       // o1.mB(); //5 not possible as call is by reference not by type
        o2.mA();
      }
}


class Book{
  protected final int pages = 100;
  final void mA(){
     System.out.println("In B.mA "+pages);
  }
}

class Encyclopedia extends Book{
  private int pages = 200; //1
  void mB(){
     System.out.println("In E.mB "+pages);       
  }
  //cannot be extended
 /* void mA(){ //2
     System.out.println("In E.mA "+pages);
  }*/
}






