package lesson_4.Shop;

public class Shop {
    private int product = 0;
    private final int max = 5;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупатель купил один товар");
        System.out.println("Товаров на склад: " + product);
        notify();
    }

    public synchronized void put(){
        while(product >= max){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Производитель добавил один товар на склад");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}

