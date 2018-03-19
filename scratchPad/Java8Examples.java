package scratchPad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class NumberSystem{
    static String id;
//Comparator class has similar abstract methods
    public static int compareNumbers(String id,String arg0) {
        return arg0.compareTo(id);
    }
    
}
public class Java8Examples {

    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        anonymousClassConsumerIteration(list);
        lambdaFunction(list);
        //reference interface -- interface names dont matter
        
        Collections.sort(list, NumberSystem::compareNumbers);
        System.out.println(list);
        
   }

    private static void lambdaFunction(ArrayList list) {
        list.forEach(x->System.out.println(x));
    }

    private static void anonymousClassConsumerIteration(ArrayList list) {
        list.forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);                
            }
            
        });
    }

}
