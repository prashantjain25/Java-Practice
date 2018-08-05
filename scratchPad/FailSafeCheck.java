package scratchPad;

import java.util.Iterator;
import java.util.Vector;

public class FailSafeCheck {

    public static void main(String[] args) {
        //vector hence is not fail safe
        Vector<String> ve = new Vector<>();
        ve.add("1");
        ve.add("2");
        Iterator<String> listE = ve.iterator();
        while (listE.hasNext()) {
            ve.add("3");
            System.out.println(listE.next());
        }
    }

}
