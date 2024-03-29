package praktikum2.kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Hewan<T> {
    ArrayList<String> namaHewan = new ArrayList<>(List.of("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"));

    public static void main(String[] args) {
        Hewan<String> hewan = new Hewan<String>();

        System.out.println("=== Tahap 1 ===");
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 2
        System.out.println("\n=== Tahap 2 ===");
        hewan.namaHewan.add("Badak");
        hewan.namaHewan.add("Bebek");

        int totalBebek = 0;
        for (String h : hewan.namaHewan) {
            if (h.equals("Bebek")) {
                totalBebek++;
            }
        }

        System.out.println("Total Bebek: " + totalBebek);
        System.out.println(
                "Posisi Index Bebek: " + hewan.namaHewan.indexOf("Bebek") + " dan "
                        + hewan.namaHewan.lastIndexOf("Bebek"));

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 3
        System.out.println("\n=== Tahap 3 ===");
        hewan.namaHewan.remove(hewan.namaHewan.indexOf("Bebek"));

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 4
        System.out.println("\n=== Tahap 4 ===");
        System.out.println("Index ke-0: " + hewan.namaHewan.get(0));
        System.out.println("Index ke-2: " + hewan.namaHewan.get(2));
        hewan.namaHewan.remove(0);
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 5
        System.out.println("\n=== Tahap 5 ===");
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        hewan.namaHewan.set(0, "Ular");
        hewan.namaHewan.add(2, "Itik");

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 6
        System.out.println("\n=== Tahap 6 ===");
        hewan.namaHewan.subList(2, 5).clear();

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 7
        System.out.println("\n=== Tahap 7 ===");
        System.out.println("Elemen pertama  : " + hewan.namaHewan.get(0));
        System.out.println("Elemen terakhir : " + hewan.namaHewan.get(hewan.namaHewan.size() - 1));

        // tahap 8
        System.out.println("\n=== Tahap 8 ===");
        System.out.println("Total elemen hewan : " + hewan.namaHewan.size());

        // tahap 9
        System.out.println("\n=== Tahap 9 ===");
        System.out.println("Posisi index badak : " + hewan.namaHewan.indexOf("Badak"));
    }
}
