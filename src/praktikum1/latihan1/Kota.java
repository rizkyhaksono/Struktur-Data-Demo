package praktikum1.latihan1;

public class Kota<E> {

    private final E element;

    private Kota(E kota) {
        element = kota;
    }

    public E getElement() {
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di Jawa Timur: " + jumlahKota.getElement() + " kota");
        System.out.println("Nama kota di Jawa Timur: " + namaKota.getElement());
    }
}