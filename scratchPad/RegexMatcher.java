package scratchPad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

    public static void main(String[] args) {
        String finalStr=null;
        String source="\"~f10.\"";
        String[] newStr=source.split("[f][\\d]+");
        for(String s:newStr) {
            source=source.replaceAll(s, "");
        }
        source="~"+source;
        String initialString="~f1";
        if(initialString.toString().toLowerCase().equals(source)) {
            System.out.println(source);
        }
        /*Pattern pat=Pattern.compile("[~][f][\\d]+[\\.]");
        String tockenMatcher = "(?![\\.\\w\\d])"+matString+"(?![\\.\\w\\d])";
        Matcher matcher = pat.matcher(source);
        if(matcher.matches() ) {
            if(matcher.find()) {
              finalStr = matcher.group(1);
              Pattern token=Pattern.compile(tockenMatcher);
              if(token.matcher(matString).matches()) {
                  if(matString.equals(finalStr)) {
                      System.out.println(finalStr);
                  }
              }
            }
        }

*/
    }

}
