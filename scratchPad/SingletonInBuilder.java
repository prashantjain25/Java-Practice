package scratchPad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonInBuilder  {
    
    /**
     * The Class Builder.
     * It will have same numnber of fields as 
     * enclosing class, i.e. it will act as builder
     */
    static class Builder implements Cloneable{
        public String name;
        public List childList=new ArrayList<String>();
        public String getName() {
            return name;
        }
        
        /**
         * Sets the name.
         * Exposed setter for change in list name, or identifier of list
         * kind of map with k=name, v=list
         * @param name the new name
         */
        public void setName(String name) {
            this.name = name;
        }
        public List getAndAddPersonList() {
            //childList.add(name);
            return createClone().childList;
        }
        private void setPersonList(List childList) {
            this.childList = childList;
        }
        public Builder createClone() {
            Builder cloned=null;
            try {
                List clonedList=new ArrayList<String>();
                this.childList.forEach(x->clonedList.add(x));
                setPersonList(clonedList);
                cloned= (Builder) super.clone();
                
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return cloned;
        }
       
    }
    private String name;
    private List childList=new ArrayList();
    public List getChildList() {
        return childList;
    }
    public void setChildList(List childList) {
        this.childList = childList;
    }
    
    /**
     * Instantiates a new singleton in builder.
     * This might return unmodifiableList but exposed
     * Builder List will have modifiable List
     * @param builder the builder
     */
    public SingletonInBuilder(Builder builder) {
        this.name=builder.name;
        // flawed implementation
        // this.childList=Collections.unmodifiableList(builder.childList);
       // List cloned=this.createClone().childList;
        this.childList=Collections.unmodifiableList(builder.childList);
    }
    
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    
    /**
     * Read resolve helps in uniqueness while deserializing.
     *
     * @return the singleton in builder
     */
    public SingletonInBuilder readResolve() {
        return this;
    }
   
    
    
}
