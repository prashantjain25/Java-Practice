package pattern;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintReverse {

    static int count=0;
    static int read;
    static char[] ch;
   static char last;
    public static void main(String[] args) {
    
        String str="This is an apple";
        char[] sch=str.toCharArray();
        
        
        while(sch[sch.length-1]!=' ') {
            last= sch[sch.length-1];
            count++;
            for(int j=sch.length-1;j>=0;j--) {
                sch[++j]=sch[j];
            }
            
            sch[0]=last;
        }
        
        System.out.println(sch);
    }

}
/*String str="This is an apple";
ch=str.toCharArray();
Pattern p= Pattern.compile(" ");
Matcher match=p.matcher(str);
while(match.find()) {
  count++;
}
reverse(ch);
}
static char[] temp;
static void reverse(char[] sent) {
temp=sent;
for(int i=0; i<sent.length;i++) {
    if(sent[i]==' ') {
        read=i;
        reverse(Arrays.copyOfRange(sent, read+1, sent.length));
        int sublength=sent.length-temp.length;
        Arrays.copyOfRange(sent, 0,sublength);
        for(int x=sublength-1; x<sent.length;x++) {
            sent[x]=0;
            }
            
        }
            
        Arrays.
    }
    System.out.print(sent+" ");
}*/

