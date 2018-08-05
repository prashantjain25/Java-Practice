package scratchPad;

import java.util.ArrayList;
import java.util.List;

public class Generics<E> {
 public E display(E ge) {
     System.out.println((E) ge);
     List<? extends E> list=new ArrayList<E>();
     return ge;
 }
    abstract class B{
        
        B(){
            
        }
    }

}
