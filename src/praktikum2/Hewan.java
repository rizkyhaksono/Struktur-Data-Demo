package praktikum2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hewan<T> {

    ArrayList<String> namaHewan = new ArrayList<>(
            List.of("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah")
    );

    public void hampusHewan(int index) {
        namaHewan.removeIf(h -> h.equals(namaHewan.get(index)));
    }

    public void tambahHewan(int index, String add) {
        namaHewan.add(index, add);
    }

    public void searchHewan(String search) {
        if (namaHewan.contains(search)) {
            System.out.println("\nHewan " + search + " ditemukan di index ke-" + namaHewan.indexOf(search));
        } else {
            System.out.println("\nHewan tidak ditemukan");
        }
    }

    public void totalHewan() {
        System.out.println("\nTotal hewan: " + namaHewan.size());
    }

    public void tampilHewan() {
        System.out.print("[ ");
        for (String hewan : namaHewan) {
            System.out.print(hewan + " ");
        }
        System.out.print("]");
    }

    public void updateHewan(int index, String update) {
        namaHewan.set(index, update);
    }

    public void posisiHewan(String pos) {
        if (namaHewan.contains(pos)) {
            System.out.println("\nPosisi " + pos + " adalah " + namaHewan.indexOf(pos) + " dan " + namaHewan.lastIndexOf(pos));
        } else {
            System.out.println("\nHewan tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Scanner scn = new Scanner(System.in);
        hewan.tampilHewan();

        System.out.println("""
                \n1. Tambah Hewan
                2. Edit Hewan
                3. Search Hewan
                4. Hapus Hewan"""
        );

        System.out.print("Masukkan pilihan: ");
        int pilihan = scn.nextInt();

        switch (pilihan) {
            case 1 -> {
                System.out.print("\n[Add] Masukkan index keberapa: ");
                int index = scn.nextInt();
                System.out.print("[Add] Masukkan nama hewan yang ditambah: ");
                String addHewan = scn.next();
                hewan.tambahHewan(index, addHewan);
                hewan.tampilHewan();
                hewan.posisiHewan(addHewan);
                hewan.totalHewan();
            }
            case 2 -> {
                System.out.print("\n[Update] Masukkan index keberapa: ");
                int indexUpdate = scn.nextInt();
                System.out.print("[Update] Masukkan nama hewan yang diupdate: ");
                String updateHewan = scn.next();
                hewan.updateHewan(indexUpdate, updateHewan);
                hewan.tampilHewan();
                hewan.posisiHewan(updateHewan);
                hewan.totalHewan();
            }
            case 3 -> {
                System.out.print("\n[Search] Masukkan nama hewan yang dicari: ");
                String searchHewan = scn.next();
                hewan.searchHewan(searchHewan);
                hewan.totalHewan();
            }
            case 4 -> {
                System.out.print("\n[Delete] Masukkan index keberapa: ");
                int indexDel = scn.nextInt();
                hewan.hampusHewan(indexDel);
                hewan.tampilHewan();
                hewan.totalHewan();
            }
            default -> {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }
}
