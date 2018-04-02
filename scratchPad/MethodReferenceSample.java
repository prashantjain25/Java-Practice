package scratchPad;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
interface methodRefer{
    static Stream x() {
        ArrayList ls=new ArrayList();
        ls.add("Forget");
        Stream st=ls.stream();
        return st;
    }
}
class abc {
    public static void display() {
        PrintStream ps=System.out;
        methodRefer.x().forEach(ps::println);
        System.out.println("Hello method reference");
    }
}
public class MethodReferenceSample  {
   
    public static void main(String[] args) {
              Runnable refer=abc::display;
              refer.run();
    }

}
