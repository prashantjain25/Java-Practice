package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddThreadDemo {

    public static void main(String[] args) {
     // shared class object
     SharedPrinter sp = new SharedPrinter();
     AtomicInteger var=new AtomicInteger(0);
     // creating two threads
     Thread t1 = new Thread(new EvenNumProducer(sp, 10,var));
     Thread t2 = new Thread(new OddNumProducer(sp, 10,var));
     // starting threads
     t1.start();
     t2.start();
    }

   }
   // Shared class used by both threads
   class SharedPrinter{
    boolean evenFlag = false;
    
    //Method for printing even numbers
    public void printEvenNum(int num){
     synchronized (this) {
       // While condition as mandated to avoid spurious wakeup
      while(!evenFlag){
       try {
        //asking current thread to give up lock
        wait();
       } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }
      }
      System.out.println(Thread.currentThread()+" "+num);
      evenFlag = false;
      // Wake up thread waiting on this monitor(lock)
      notify();
      
     }
     
    }
    
    //Method for printing odd numbers
    public void printOddNum(int num){
     synchronized (this) {
       // While condition as mandated to avoid spurious wakeup
      while(evenFlag){
       try {
        //asking current thread to give up lock
        wait();
       } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }
      }
      System.out.println(Thread.currentThread()+" "+num);
      evenFlag = true;
      // Wake up thread waiting on this monitor(lock)
      notify();
      
     }
    }
   }

   // Thread Class generating Even numbers
   class EvenNumProducer implements Runnable{
       SharedPrinter sp;
       int index;
    private AtomicInteger var;
       EvenNumProducer(SharedPrinter sp, int index, AtomicInteger var){
           this.sp = sp;
           this.index = index;
           this.var=var;
       }
       @Override
       public void run() {
           for(int i = 0; i <= index; i++){
               sp.printEvenNum(var.incrementAndGet());
           }
           
       }
       
   }

   //Thread Class generating Odd numbers
   class OddNumProducer implements Runnable{
       SharedPrinter sp;
       int index;
    private AtomicInteger var;
       OddNumProducer(SharedPrinter sp, int index,AtomicInteger var){
           this.sp = sp;
           this.index = index;
           this.var=var;
       }
       @Override
       public void run() {
           for(int i = 0; i <= index; i++){
               sp.printOddNum(var.incrementAndGet());
           }
       }
   }
