package expressions;

public class Root {
    static int digit;
    static String text;
    public String startTag(){
	return "StartRoot ";
    }
    public String endTag(){
	return " EndRoot";
    }
    public int getDigit() {
        return digit;
    }
    public void setDigit(int digit) {
        this.digit = digit;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
