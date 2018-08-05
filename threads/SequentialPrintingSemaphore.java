package threads;

public class SequentialPrintingSemaphore {

    static class SemaphoreX{
        boolean isNotify;
        Thread isCurrentThread;
        public SemaphoreX() {
            this.isCurrentThread=Thread.currentThread();
        }
        public synchronized void acquire() {
            isNotify=true;
            this.notify();
        }
        public synchronized void release() {
            while(!isNotify)
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            isNotify=false;
        }
    }
    public static void main(String[] args) {
        Thread A= new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
            
        });
        Thread B= new Thread(new Runnable() {
            @Override
            public void run() {
            }
            
        });

    }

}
