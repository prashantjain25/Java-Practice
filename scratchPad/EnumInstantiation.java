package scratchPad;

enum solar{
    
    EARTH,
    MARS,
    NEPTUNE;
    private static EnumInstantiation test=new EnumInstantiation();
   EnumInstantiation getInstance (){
	return this.test;
    }
}

/**
 * The Class EnumInstantiation.
 * Joshua Bloch solution to singleton; but, prone to eager initialization
 */
public class EnumInstantiation {

}
