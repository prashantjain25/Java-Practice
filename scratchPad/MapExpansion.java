package scratchPad;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExpansion {
    Entry[] table;
    public static void main(String[] args) {
        //Map e=new HashMap();
        //new HashMap(e.entrySet()toArray());
   
    }
    /**Read below for explaination**/
   /* void transfer(Entry[] newTable) {
            Entry[] src = table;
            int newCapacity = newTable.length;
            for (int j = 0; j<src.length; j++) {
                Entry e = src[j];
                if (e != null) {
                    src[j] = null;
         
                    // --------- Below piece of code creates a problem  --------- //
                    do {
             
                        Entry next = e.next; 
                        int i = indexFor(e.hash, newCapacity);
                        e.next = newTable[i];
                        newTable[i] = e;
                        e = next;
         
                    } while (e != null);
            }
        }
    }*/
        

}
