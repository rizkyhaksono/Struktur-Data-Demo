/**
 @author: rizkyhaksono
 */

package praktikum2;

public class LinkedListManual {

    int[] data;

    public void add (int add) {

    }

    public void printList() {
        System.out.println(data);
    }

    public static void main(String[] args) {
        LinkedListManual list = new LinkedListManual();

        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);

        list.printList();
    }
}
