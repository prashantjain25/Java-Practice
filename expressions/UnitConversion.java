package expressions;

/*public class UnitConversion {

    public static void main(String[] args) {
            byte i=-5;
            int x=i>>>1;
        System.out.println(Integer.toUnsignedString(i,2)+": "+i+"  "+Integer.toUnsignedString(x,2)+": "+x);
        
    }*/
    public class UnitConversion {
        
        public void printBinaryFormat(int number){
            int binary[] = new int[25];
            int index = 0;
            while(number > 0){
                binary[index++] = number%2;
                number = number/2;
            }
            for(int i = index-1;i >= 0;i--){
                System.out.print(binary[i]);
            }
        }
         
        public static void main(String a[]){
            UnitConversion dtb = new UnitConversion();
            dtb.printBinaryFormat(21);
        }
    }

    
