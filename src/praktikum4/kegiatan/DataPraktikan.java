/**
 @author: rizkyhaksono
 */

package praktikum4.kegiatan;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * Created by rizkyhaksono on 10/04/23.
 * 
 * @Project: DataPraktikan
 * 
 * @File: DataPraktikan.java
 * 
 * @Desc: Program ini digunakan untuk menyimpan data praktikan dan asisten.
 * 
 */

public class DataPraktikan {
    HashMap<String, String> tabelData = new HashMap<String, String>();
    HashMap<String, String> tabelSesiLogin = new HashMap<String, String>();

    Scanner scn = new Scanner(System.in);

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.startsWith("IF") && !tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("NIM tidak valid atau sudah terdaftar");
        }
        return true;
    }

    public void tampil() {
        System.out.println("Total Data Yang Tersimpan : " + tabelData.size());
        for (Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("NIM Praktikan: " + key + ", Nama Asisten: " + value);
            } else {
                System.out.println("Data tidak ada");
            }
        }
    }

    public void listNimPraktikan() {
        System.out.println("--- List NIM ---");
        for (Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getKey() != null) {
                String key = entry.getKey();
                System.out.println("NIM Praktikan: " + key);
            } else {
                System.out.println("Data tidak ada");
            }
        }
    }

    public void listNamaPraktikan() {
        System.out.println("--List Nama--");
        for (Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getValue() != null) {
                String value = entry.getValue();
                System.out.println("Nama Asisten: " + value);
            } else {
                System.out.println("Data tidak ada");
            }
        }
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.containsValue(namaAsisten)) {
            tabelData.remove(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Data tidak ada");
        }
        return true;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.containsValue(namaAsisten)) {

            System.out.println("====================================");
            System.out.println("Masukkan data baru!");

            // tabelData.remove(nimPraktikan);
            System.out.print("Masukkan NIM: ");
            String nimBaru = scn.nextLine();

            System.out.print("Masukkan Nama Asisten: ");
            String namaBaru = scn.nextLine();

            tabelData.replace(nimBaru, namaBaru);
            System.out.println("Data berhasil diubah");
        } else {
            System.out.println("Data tidak ada");
        }
    }

    public void searchData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.containsValue(namaAsisten)) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ada");
        }
    }

    public int totalEmail() {
        int total = 0;
        for (Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getKey() != null) {
                String key = entry.getKey();
                if (key.contains("IF")) {
                    total++;
                }
            }
        }
        return total;
    }

    public void login(String user, String pass) {
        if (tabelSesiLogin.containsKey(user) && tabelSesiLogin.get(user).equals(pass)) {
            System.out.println("Anda berhasil login");
        } else {
            System.out.println("Gagal login");
        }
    }

    public void logout(String user, String pass) {
        if (tabelSesiLogin.containsKey(user) && tabelSesiLogin.get(user).equals(pass)) {
            System.out.println("Anda berhasil logout");
            System.exit(0);
        } else {
            System.out.println("Gagal logout");
        }
    }

    public static void main(String[] args) {
        DataPraktikan dp = new DataPraktikan();
        dp.tabelSesiLogin.put("rizkyhaksono", "123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan email: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.contains("@umm.ac.id")) {
            String[] split = username.split("@");
            username = split[0];

            while (dp.tabelSesiLogin.containsKey(username) &&
                    dp.tabelSesiLogin.get(username).equals(password)) {
                System.out.println("====================================");
                System.out.println("Selamat datang " + username);
                System.out.println("====================================\n");
                System.out.println("1. Tambah Data" +
                        "\n2. Tampil Data" +
                        "\n3. List NIM Praktikan" +
                        "\n4. List Nama Asisten" +
                        "\n5. Total Email" +
                        "\n6. Hapus Data" +
                        "\n7. Edit Data" +
                        "\n8. Search Data" +
                        "\n9. Logout");

                System.out.print("Masukkan pilihan: ");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1: {
                        System.out.println("\n--- Tambah Data ---");
                        System.out.println("====================================");
                        System.out.print("Masukkan NIM: ");
                        String nimPraktikan = scanner.next();

                        System.out.print("Masukkan Nama Asisten: ");
                        String namaAsisten = scanner.next();

                        dp.tambahData(nimPraktikan, namaAsisten);
                        System.out.println("====================================\n");
                        break;
                    }
                    case 2: {
                        System.out.println("\n--- Tampil Data ---");
                        System.out.println("====================================");
                        dp.tampil();
                        System.out.println("====================================\n");
                        break;
                    }
                    case 3: {
                        System.out.println("\n--- Tampil Data NIM Praktikan ---");
                        System.out.println("====================================");
                        dp.listNimPraktikan();
                        System.out.println("====================================\n");
                        break;
                    }
                    case 4: {
                        System.out.println("\n--- Tampil Data Nama Asisten ---");
                        System.out.println("====================================");
                        dp.listNamaPraktikan();
                        System.out.println("====================================\n");
                        break;
                    }
                    case 5: {
                        System.out.println("\n====================================");
                        System.out.println("Total email yang terdaftar : " + dp.totalEmail());
                        System.out.println("====================================\n");
                        break;
                    }
                    case 6: {
                        System.out.println("\n--- Hapus Data ---");
                        System.out.println("====================================");
                        System.out.print("Masukkan NIM: ");
                        String nimPraktikan = scanner.next();

                        System.out.print("Masukkan Nama Asisten: ");
                        String namaAsisten = scanner.next();

                        dp.hapusData(nimPraktikan, namaAsisten);
                        System.out.println("====================================\n");
                        break;
                    }
                    case 7: {
                        System.out.println("\n--- Edit Data ---");
                        System.out.println("====================================");
                        System.out.print("Masukkan NIM: ");
                        String nimPraktikan = scanner.next();

                        System.out.print("Masukkan Nama Asisten: ");
                        String namaAsisten = scanner.next();

                        dp.editData(nimPraktikan, namaAsisten);
                        System.out.println("====================================\n");
                        break;
                    }
                    case 8: {
                        System.out.println("\n--- Search Data ---");
                        System.out.println("====================================");
                        System.out.print("Masukkan NIM: ");
                        String nimPraktikan = scanner.next();

                        System.out.print("Masukkan Nama Asisten: ");
                        String namaAsisten = scanner.next();

                        dp.searchData(nimPraktikan, namaAsisten);
                        System.out.println("====================================\n");
                        break;
                    }
                    case 9: {
                        System.out.println("\n--- Logout ---");
                        System.out.println("====================================");
                        System.out.print("Masukkan username: ");
                        String user = scanner.next();

                        System.out.print("Masukkan password: ");
                        String pass = scanner.next();

                        while (!user.contains("@umm.ac.id")) {
                            System.out.println("Domain anda bukan @umm.ac.id");
                            System.out.print("Masukkan username: ");
                            user = scanner.next();

                            System.out.print("Masukkan password: ");
                            pass = scanner.next();
                            if (user.contains("@umm.ac.id")) {
                                break;
                            }
                        }

                        String[] splitted = user.split("@");
                        user = splitted[0];
                        dp.logout(user, pass);

                        System.out.println("====================================\n");
                        break;
                    }
                    default: {
                        System.out.println("\n====================================");
                        System.out.println("Pilihan tidak ada");
                        System.out.println("====================================\n");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Domain anda bukan @umm.ac.id");
            main(args);
        }

        scanner.close();
    }
}
