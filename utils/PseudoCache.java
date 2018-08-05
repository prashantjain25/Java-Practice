package utils;

import java.util.HashMap;
import java.util.PriorityQueue;

public class PseudoCache {

    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        map.put(2,"Rock");
        map.put(1,"Metal");
        HashMap<Integer,String> map2= new HashMap<Integer,String>();
        map2.put(2,"jazz");
        map2.put(1,"acid rock");
        
        PriorityQueue<HashMap<Integer,String>> pr= new PriorityQueue<>();
        pr.add(map); //implement Comparaor and set
        pr.add(map2);
        pr.stream().forEach(System.out::println);
    }

}
