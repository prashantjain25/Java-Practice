package java8demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ArraysIteration {

    static Integer[] arr= {13,2,14,15};  
    public static void main(String[] args) {
        ArrayList<Integer> ar2=new ArrayList();
        ar2.add(13);
        ar2.add(2);
        //Supplier sup=()->{return new Object();};
    Predicate<Integer>pr=e->e>2;
    
    /* now with primitives*/
     int[] arr2= {1,2,3,4,5};
     int[] arr3=new int[1];
     arr3[0]=1;
     //arr2.arr2
     //IntUnaryOperator n =2;
     IntFunction func=e->e*2;
    // Function<IntUnaryOperator,Function> finalFunc=(Function<IntUnaryOperator, Function>) func.andThen(e->e*2);
     List<int[]> lst=Stream.of(arr3).collect(Collectors.toList()); //map(func).forEach(System.out::print);
     lst.stream().forEach(System.out::print);;
     f(1);
     
    //Stream str= Stream.of(arr2);
   //  Int<Integer> sup=()->new Integer(e);
    // Funtion<int[],Integer> converter=x->x;
    // Stream.of(finalFunc).forEach(System.out::println);
     
    }
    public static void f(Integer i) {
        i++;
        System.out.println("_________"+i);
    }
}
