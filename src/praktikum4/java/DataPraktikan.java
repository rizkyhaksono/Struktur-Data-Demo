package praktikum4.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class DataPraktikan {
    HashMap<String, String> tabelData = new HashMap<String, String>();
    HashMap<String, String> tabelSesiLogin = new HashMap<String, String>();

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        tabelData.put(nimPraktikan, namaAsisten);
        return true;
    }

    public void tampil() {
        System.out.println("Total Data Yang Tersimpan : " + tabelData.size());
        for (Entry<String, String> entry : tabelData.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("NIM Praktikan: " + key + " Nama Asisten : " + value);
        }
    }

    public void listNimPraktikan() {
        System.out.println("--List NIM--");
        for (Entry<String, String> entry : tabelData.entrySet()) {
            String key = entry.getKey();
            System.out.println("NIM Praktikan: " + key);
        }
    }

    public void listNamaPraktikan() {
        System.out.println("--List Nama--");
        for (Entry<String, String> entry : tabelData.entrySet()) {
            String value = entry.getValue();
            System.out.println("Nama Asisten : " + value);
        }
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        String key;
        for (Entry<String, String> entry : tabelData.entrySet()) {
            key = entry.getKey();
            if (key == nimPraktikan) {
                tabelData.remove(nimPraktikan, namaAsisten);
                System.out.println("Data sudah dihapus");
            } else {
                System.out.println("Data tidak ada");
            }
        }
        return true;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        String key;
        for (Entry<String, String> entry : tabelData.entrySet()) {
            key = entry.getKey();
            if (key == nimPraktikan) {
                tabelData.put(nimPraktikan, namaAsisten);
                System.out.println("Data sudah diupdate");
            } else {
                System.out.println("Data tidak ada");
            }
        }
    }

    public void searchData(String nimPraktikan) {
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getKey() == nimPraktikan) {
                System.out.println("Found NIM " + entry.getKey() + " Nama Asisten " +
                        entry.getValue());
            }
        }
    }

    public int totalEmail() {
        int total = 0;
        for (Entry<String, String> entry : tabelSesiLogin.entrySet()) {
            String key = entry.getKey();
            if (!key.isEmpty()) {
                total++;
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
        } else {
            System.out.println("Gagal logout");
        }
    }

    public static void main(String[] args) {
        DataPraktikan dp = new DataPraktikan();

        dp.tabelSesiLogin.put("rizkyhaksono", "123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // check if user has domain email or not
        if (username.contains("@umm.ac.id")) {
            String[] split = username.split("@");
            username = split[0];

            if (dp.tabelSesiLogin.containsKey(username) && dp.tabelSesiLogin.get(username).equals(password)) {

                dp.tambahData("325", "Rizky");
                System.out.print("\n");
                dp.tampil();
                System.out.print("\n");
                System.out.print("Total email yang terdaftar : " + dp.totalEmail());

                System.out.print("\n");
                dp.listNimPraktikan();
                System.out.print("\n");
                dp.listNamaPraktikan();
                System.out.print("\n");

                dp.editData("325", "Izza");
                System.out.print("\n");
                dp.tampil();
                System.out.print("\n");

                System.out.print("\n");
                dp.searchData("325");
                System.out.print("\n");

                dp.hapusData("325", "Izza");
                dp.tampil();
                System.out.print("\n\n");

                System.out.print("Apakah anda mau logout? [y/n] ");
                String logout = scanner.nextLine();
                if (logout.equals("Y") || logout.equals("y")) {
                    dp.logout(username, password);
                } else {
                    dp.logout(null, null);
                }
            } else {
                System.out.println("Username atau password anda tidak benar");
            }
        } else {
            System.out.println("Domain anda bukan @umm.ac.id");
        }

        scanner.close();
    }
}
