/**
 @author: rizkyhaksono
 */

package praktikum3;

import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {

    // String email;
    HashMap<String, String> tabelData = new HashMap<>();

    public boolean tambahData(String nim, String nama) {
        tabelData.put(nim, nama);
        return true;
    }

    public void tampil() {
        System.out.println("Total Data Yang Tersimpan : " + tabelData.size());
    }

    public void listNimPraktikan() {
        System.out.println("List Nim Praktikan : ");
        tabelData.forEach((key, value) -> {
            System.out.println(key);
        });
    }

    public void listNamaAssisten() {
        System.out.println("List Nama Assisten : ");
        tabelData.forEach((key, value) -> {
            System.out.println(value);
        });
    }

    public boolean hapusData(String nimPraktikan, String namaAssisten) {
        tabelData.remove(nimPraktikan, namaAssisten);
        return true;
    }

    public void editData(String nimPraktikan, String namaAssisten) {
        tabelData.replace(nimPraktikan, namaAssisten);
    }

    public void searchData(String namaAssisten) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Data yang dicari : ");
            String input = scn.nextLine();

            if (namaAssisten.contains(input)) {
                listNimPraktikan();
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public static void main(String[] args) {

        DataPraktikan data = new DataPraktikan();
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Masukkan data [nim praktikan] [nama assisten] : ");

            String nim = scn.nextLine();
            String asisten = scn.nextLine();

            System.out.println(
                    "Pilih menu :" +
                    "\n1. Tambah data" +
                    "\n2. Cari data" + 
                    "\n3. Edit data" +
                    "\n4. Hapus data"
                    );

            int menu = scn.nextInt();

            switch (menu) {
                case 1: {
                    data.tambahData(nim, asisten);

                    data.listNimPraktikan();
                    data.listNamaAssisten();
                }
                case 2: {
                    data.searchData(asisten);
                }
                case 3: {
                    System.out.print("Masukkan data baru [nim praktikan] [nama assisten] : ");
                    String nimBaru = scn.nextLine();
                    String asistenBaru = scn.nextLine();

                    data.editData(nimBaru, asistenBaru);

                    data.listNimPraktikan();
                    data.listNamaAssisten();
                }
                case 4: {
                    data.hapusData(nim, asisten);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        data.tampil();
    }
}
