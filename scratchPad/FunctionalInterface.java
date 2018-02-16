package scratchPad;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {

    public static void main(String[] args) {
Consumer itera=new Consumer(){

    @Override
    public void accept(Object arg0) {
	System.out.println(arg0);
    }
};
	List collection=new ArrayList();
	collection.add("Dog");
	collection.add("Cat");
	collection.add("Elephant");
	collection.forEach(itera);
	
	collection.forEach(x->{
	    System.out.println(x);
	});
	int x=10;
	
    }

}
