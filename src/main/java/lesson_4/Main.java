package lesson_4;

public class Main {
    public static void main(String[] args) {
        MyThreadClass t1 = new MyThreadClass();
        Thread t2 = new Thread(new MyRunnableClass());
        t1.start();
        t2.start();

        System.out.println(t1.getState());

        //BLOCKED
        //NEW
        //RUNNABLE
        //TERMINATED
        //TIME_WAITED
        //WAITING

       /* System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());*/

        /*t1.wait();
        t1.notify();
        t1.notifyAll();*/

    }
}

class MyRunnableClass implements Runnable{

    @Override
    public void run() {
        /*for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }*/
    }
}

class MyThreadClass extends Thread{
    /*@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }*/
}