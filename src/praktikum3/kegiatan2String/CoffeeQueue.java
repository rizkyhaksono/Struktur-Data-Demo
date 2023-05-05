package praktikum3.kegiatan2String;

import java.util.Scanner;

public class CoffeeQueue {

    public FirstLastLink theQueue;

    public CoffeeQueue() {
        theQueue = new FirstLastLink();
    }

    public void enqueue(String data) {
        theQueue.insertLast(data);
    }

    public String dequeue() {
        return theQueue.deleteFirst();
    }

    public void peek() {
        System.out.println("Top queue : " + theQueue.first.dData);
    }

    public boolean isEmpty() {
        if (theQueue.first == null) {
            return true;
        } else {
            return false;
        }
    }

    public void size() {
        int temp = 0;
        Link current = theQueue.first;

        while (current != null) {
            temp++;
            current = current.next;
        }
        System.out.println("Size : " + temp + "\n");
    }

    public void displayQueue() {
        System.out.print("Queue [Head -> Tail] : ");
        theQueue.displayLink();
    }

    public static void main(String[] args) {
        CoffeeQueue coffeeQueue = new CoffeeQueue();

        // coffeeQueue.enqueue("Matcha");
        // coffeeQueue.enqueue("Cappucino");
        // coffeeQueue.displayQueue();

        // coffeeQueue.enqueue("Americano");
        // coffeeQueue.enqueue("Espresso");
        // coffeeQueue.displayQueue();

        // coffeeQueue.dequeue();
        // coffeeQueue.displayQueue();

        // coffeeQueue.peek();
        // coffeeQueue.size();

        // System.out.println("Empty : " + coffeeQueue.isEmpty());

        // menu
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        String input = "";

        do {
            System.out.println("Coffee Shop");
            System.out.println("Menu : ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Display");
            System.out.println("6. Empty");
            System.out.println("7. Exit");
            System.out.print("Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan input : ");
                    input = sc.nextLine();
                    coffeeQueue.enqueue(input);
                    break;
                case 2:
                    coffeeQueue.dequeue();
                    break;
                case 3:
                    coffeeQueue.peek();
                    break;
                case 4:
                    coffeeQueue.size();
                    break;
                case 5:
                    coffeeQueue.displayQueue();
                    break;
                case 6:
                    System.out.println("Empty : " + coffeeQueue.isEmpty() + "\n");
                    break;
                case 7:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 7);

        sc.close();
    }
}
