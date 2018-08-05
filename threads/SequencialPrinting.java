package threads;

import java.util.concurrent.atomic.AtomicInteger;

class OrderingA extends Thread {
    SharedObject obj = null;
    boolean flag = false;

    private AtomicInteger counter;

    OrderingA(String name, SharedObject obj, AtomicInteger counter) {
        super(name);
        this.obj = obj;
        this.counter = counter;
    }

    public void run() {
        while (true) {
            anotherMethod();
        }
    }


    private void anotherMethod() {
       
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName() + " Section 2");

            if (obj.flag) {
                
                System.out.println(Thread.currentThread().getName() + " "
                        + counter.getAndIncrement());
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            obj.flag = true;
            obj.notify();
        }
    }
}
class OrderingB extends Thread {
    SharedObject obj = null;
    boolean flag = false;

    private AtomicInteger counter;

    OrderingB(String name, SharedObject obj, AtomicInteger counter) {
        super(name);
        this.obj = obj;
        this.counter = counter;
    }

    public void run() {
        while (true) {
            prevMethod();
        }
    }

    private void prevMethod() {
       
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName() + " Section 1");
            if (!obj.flag) {
                try { 
                    System.out.println(Thread.currentThread().getName() + " "
                            + counter.getAndIncrement());
                    obj.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            obj.flag = false;
            obj.notify();
        }
    }
}
public class SequencialPrinting {

    public static void main(String... arg) {
        AtomicInteger counter = new AtomicInteger(3);
        SharedObject lock1 = new SharedObject();
        Thread t1 = new OrderingA("Thread 1", lock1, counter);
        Thread t2 = new OrderingB("Thread 2", lock1, counter);
       
        t2.start();
        t1.start();
    }
}
