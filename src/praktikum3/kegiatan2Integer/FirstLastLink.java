/**
 @author: rizkyhaksono
 */

package praktikum3.kegiatan2Integer;

public class FirstLastLink {

    public Link first;
    public Link last;

    public FirstLastLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int deleteFirst() {
        int temp = (int) first.dData;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayLink() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
}
