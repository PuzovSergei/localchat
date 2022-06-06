package lesson_4.Shop;

public class Producer implements Runnable{
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }


    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            shop.put();
        }
    }
}