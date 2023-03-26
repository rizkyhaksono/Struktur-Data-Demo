/**
 @author: rizkyhaksono
 */

package praktikum2.latihan1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedList {

    ArrayList<String> namaHewan = new ArrayList<>(
            List.of("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));

    public void hampusHewan(String del) {
        namaHewan.remove(del);
    }

    public void tambahHewan(String add) {
        namaHewan.add(add);
    }

    public void tampilHewan() {
        for (String hewan : namaHewan) {
            System.out.print(hewan + " ");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.tampilHewan();

        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("\nMasukkan nama hewan yang ditambah: ");
            String addHewan = scn.nextLine();

            linkedList.tambahHewan(addHewan);
            linkedList.tampilHewan();

            System.out.print("\nMasukkan nama hewan yang dihapus: ");
            String delHewan = scn.nextLine();

            linkedList.hampusHewan(delHewan);
        } catch (Exception e) {
            System.out.println(e);
        }
        linkedList.tampilHewan();
    }
}
