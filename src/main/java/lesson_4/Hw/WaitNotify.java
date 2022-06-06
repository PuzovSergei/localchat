package lesson_4.Hw;

public class WaitNotify {
    private final Object monitor = new Object();
    private volatile char currentLetter = 'A';

    void printA(){
        synchronized (monitor){
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A'){
                        monitor.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'B';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void  printB(){
        synchronized (monitor){
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B'){
                        monitor.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'C';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    void  printC(){
        synchronized (monitor){
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C'){
                        monitor.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'A';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    void run() throws InterruptedException{
        Thread t1 = new Thread(this::printA);
        Thread t2 = new Thread(this::printB);
        Thread t3 = new Thread(this::printC);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
