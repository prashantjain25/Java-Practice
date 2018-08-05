package scratchPad;

class C extends Thread {
    static String hull1;
    static String hull2;
    C(String a, String b){
        hull1=a;
        hull2=b;
    }
    public void run() {
        while(true){
            System.out.println("______"+Thread.currentThread().getName());
            myStatic();
            
        
        }
    }
    
   static synchronized void myStatic(){
       
       
       System.out.println(Thread.currentThread().getName());
       synchronized(hull2){
           System.out.println(Thread.currentThread().getName()+"__ "+hull1+" "+hull2);
       }
    
   }
}

class D extends Thread {
    String hull1;
    String hull2;
    D(String a, String b){
        hull1=a;
        hull2=b;
    }
    public void run() {
            try {
                while(true){
                myNonStatic();
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
    }
     public  void myNonStatic(){
         synchronized(hull1) {
        synchronized(hull2){
            System.out.println(Thread.currentThread().getName()+"__ "+hull1+" "+hull2);
        }
         }
    }

}

public class DeadlockExamples {

    public static void main(String[] args) throws InterruptedException {
        String race="punch";
        String race3="kick";
       C b=new C(race,race3);
        C c = new C(race3,race);
        /*D b=new D(race,race3);
        D c = new D(race3,race);*/
       b.start();
        Thread.sleep(500);
        c.start();
                
    }

}
