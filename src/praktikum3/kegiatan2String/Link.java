package praktikum3.kegiatan2String;

public class Link {

    public String dData;
    public Link next;

    public Link(String d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}