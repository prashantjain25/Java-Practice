package java8demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class DeDuplicate {

    public static void main(String[] args) {
       List<Integer> ls=new ArrayList<>();
       ls.add(1);
       ls.add(1);
       ls.add(2);
       ls.add(3);
       Supplier sup=HashSet::new; //option 1
       Supplier sup2=ArrayList::new;
       HashSet has=ls.stream().collect(Collectors.toCollection(sup));
       //has.stream().forEach(System.out::println);
       
       List lst = (List) ls.stream().filter(e->Collections.frequency(ls,e)>1).distinct().collect(Collectors.toList());
           //lst.stream().forEach(System.out::println);
       Map map=new HashMap();
       map.put(1, "a");
       map.put(2,"b");
       Predicate<Integer> pr=e->e>1;
       map.keySet().stream().filter(pr).forEach(e->System.out.println(map.get(e)+" "+e));
           
    }

}
