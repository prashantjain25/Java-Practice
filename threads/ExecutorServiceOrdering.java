package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceOrdering {

    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(3);
        Runnable runx=new Task();
        ex.submit(runx);

    }
    static class Task implements Runnable{
            int counter=0;
            int flag=0;
        @Override
        public void run() {
            counter++;
            if(counter==10) {
                flag=1;
                return;
            }
            System.out.println(Thread.currentThread());
            if(flag!=1)
            run();
        }
        
    }

}
