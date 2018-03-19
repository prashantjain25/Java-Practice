package arrays;

public class Encoder {

    public static void main(String a[]) {
        int offset = 13;
        String str = "ADY";
        char[] array = new char[26];

        for (int i = 0; i < 26; i++) {
            array[i] = (char) (i + 65);
        }
        for (int i = 0; i < str.length(); i++) {
            int index = getPos(str.charAt(i));
                int newPos=index+offset;
                if (newPos >= 26) {
                    newPos = newPos-26; //decoder 26+newPos
            }
            System.out.print(array[newPos]);
            }
    }

    public static int getPos(char ch) {
        int pos=(int)ch-65;
        return pos;
    }
}
