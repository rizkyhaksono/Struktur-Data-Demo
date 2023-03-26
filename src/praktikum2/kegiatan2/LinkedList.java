/**
 @author: rizkyhaksono
 */

package praktikum2.kegiatan2;

public class LinkedList {

    Node head;

    public void add(int add) {
        Node node = new Node(add);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printList() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.datas + " ");
            n = n.next;
        }

        System.out.print(n.datas + " ");
    }

    public void sortData() {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.datas > index.datas) {
                        temp = current.datas;
                        current.datas = index.datas;
                        index.datas = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
        printList();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);

        System.out.println("Data before sorting: ");
        list.printList();

        System.out.println("\nData after sorting: ");
        list.sortData();
    }
}
