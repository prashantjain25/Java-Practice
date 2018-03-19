package expressions;

public class Fraction {
    static int digit;
    static int levels;
    public String startTag(){
	StringBuffer stf=new StringBuffer();
	for(int i=0;i<levels;i++){
	    stf.append("Start");
	}
	return " "+stf+"Fraction";
    }
    public String endTag(){
	StringBuffer stf=new StringBuffer();
	for(int i=0;i<levels;i++){
	    stf.append("End");
	}
	return " "+stf+"Fraction";
    }
    public int getDigit() {
        return digit;
    }
    public void setDigit(int digit) {
        this.digit = digit;
    }
    
}
