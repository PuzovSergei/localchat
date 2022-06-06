package lesson_4;

public class DeadLockMain {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockOne one = new DeadLockOne();
        one.start();
        DeadLockTwo two = new DeadLockTwo();
        two.start();
    }

    static class DeadLockOne extends Thread {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread1 захватил Lock1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 ждет освободждения Lock2");
                synchronized (lock2){
                    System.out.println("Thread1 захватил Lock2");
                }
            }
        }
    }

    static class DeadLockTwo extends Thread {
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread2 захватил Lock2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 ждет освобождения Lock1");
                synchronized (lock1){
                    System.out.println("Thread2 захватил Lock1");
                }
            }
        }
    }
}
