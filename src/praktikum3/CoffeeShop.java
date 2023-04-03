/**
 @author: rizkyhaksono
 */

package praktikum3;

public class CoffeeShop {

    String minuman;
    String storeName[];

    public void enqueue(String minum) {
        storeName = new String[5];
        storeName[0] = minum;
    }

    public void dequeue() {
        storeName[0] = null;
    }

    public void peek() {
        System.out.println(storeName[0]);
    }

    public void isEmpty() {
        if (storeName[0] == null) {
            System.out.println("Kosong");
        } else {
            System.out.println("Ada");
        }
    }

    public void size() {
        System.out.println(storeName.length);
    }

    public static void main(String[] args) {
        CoffeeShop coffee = new CoffeeShop();

        coffee.enqueue("V60");
        coffee.peek();
        coffee.isEmpty();
        coffee.dequeue();
        coffee.isEmpty();
        coffee.size();
    }
}
