package scratchPad;

import java.util.HashMap;
import java.util.Map;

class Book2 {
    private String title, isbn;
    public boolean equals(Object o){        
       return (o instanceof Book2 && ((Book2)o).isbn.equals(this.isbn));
    }
    public void setIsbn(String string) {
        this.isbn=isbn;
        
    }

    // ... setters and getters for title and isbn
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

public class TestClass {    
  static Book2Store bs = new Book2Store();
  
  public static void main(String[] args)   {
    Book2 b = new Book2(); b.setIsbn("111");
    bs.addBook2(b, 10);
    System.out.println(bs.getNumberOfCopies(b));
    
    b = new Book2(); b.setIsbn("111");
    System.out.println(bs.getNumberOfCopies(b));
  }
}
