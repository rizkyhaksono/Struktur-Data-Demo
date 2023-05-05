/**
 @author: rizkyhaksono
 */

package praktikum3.kegiatan2Integer;

public class Link {

    public int dData;
    public Link next;

    public Link(int d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
