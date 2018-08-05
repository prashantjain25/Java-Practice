package scratchPad;

import java.util.HashMap;
import java.util.Map;

class ElementMap{
    String isbn;
    ElementMap(){
        this.isbn="testmap";
    }
     /*int hashcode(String isbn) {
        return 10;
    }*/
    public boolean equals(Object o){        
        return (o instanceof ElementMap && ((ElementMap)o).isbn.equals(this.isbn));
     }
}
public class HashMapTest {
    static HashMap<ElementMap,Integer>  map=new HashMap<>();
    public static void main(String[] args) {
            
            map.put(new ElementMap(),10);
            System.out.println(new HashMapTest().getValue(map));
    }

    private  int getValue(HashMap<ElementMap,Integer> map) {
        return  map.get(new ElementMap());
    }
    class Book2Store {
        Map<Book2, Integer> map = new HashMap<Book2, Integer>();    
        public int getNumberOfCopies(Book2 b){
        return map.get(b);
        }
        public void addBook2(Book2 b, int numberofcopies){
        map.put(b, numberofcopies);
        }
        // ... other useful methods.
    }
}
