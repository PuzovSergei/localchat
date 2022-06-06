package lesson_4.Hw;

public class Main {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();
        try {
            wn.run();
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
