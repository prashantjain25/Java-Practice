package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksVsSynchronize {
    static int foo=0;
    public static void main(String[] args) throws InterruptedException {
        
        Lock lock=new ReentrantLock();
        
        Thread A =new Thread(new myThread(foo,lock));
        Thread B =new Thread(new myThread(foo,lock));
        A.start();
        B.start();
        
        A.join();
        B.join();
        
    }
    static class myThread implements Runnable{
    Lock lock=null;
    
        public myThread(int foo,Lock lock) {
           this.lock=lock;
        }

    @Override
    public void run() {
       for(int i=0; i<500; i++) {
           lock.lock();
           foo++;
           System.out.println(foo+ " "+Thread.currentThread().getName());
           lock.unlock();
       }
        
    }
    }

}
