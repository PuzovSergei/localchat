package lesson_4.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        Consumer consumer1 = new Consumer(shop);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();
    }
}
