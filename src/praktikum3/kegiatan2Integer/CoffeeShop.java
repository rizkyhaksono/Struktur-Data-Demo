/**
 @author: rizkyhaksono
 */

package praktikum3.kegiatan2Integer;

public class CoffeeShop {

    public FirstLastLink theList;

    public CoffeeShop() {
        theList = new FirstLastLink();
    }

    public void enqueue(int j) {
        theList.insertLast(j);
    }

    public long dequeue() {
        return theList.deleteFirst();
    }

    public void peek() {
        System.out.println("Top stack : " + theList.first.dData);
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void size() {
        int temp = theList.first.dData + theList.last.dData;
        System.out.println("Size : " + temp + "\n");
    }

    public void displayQueue() {
        System.out.println("Queue [Head -> Tail] : ");
        theList.displayLink();
    }

    public static void main(String[] args) {
        CoffeeShop queue = new CoffeeShop();

        queue.enqueue(10);
        queue.enqueue(40);
        queue.displayQueue();
        System.out.println("Empty : " + queue.isEmpty());
        queue.peek();
        queue.size();

        queue.enqueue(50);
        queue.enqueue(5);
        queue.displayQueue();
        System.out.println("Empty : " + queue.isEmpty());
        queue.peek();
        queue.size();

        queue.dequeue();
        queue.displayQueue();
        System.out.println("Empty : " + queue.isEmpty());
        queue.peek();
        queue.size();
    }
}
