package lesson_4.Shop;

public class Consumer implements Runnable{
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }


    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            shop.get();
        }
    }
}
