/**
 @author: rizkyhaksono
 */

package praktikum1.latihan2.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Konsumsi<Makanan, Minuman>> listKonsumsi = new ArrayList<>();

        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<Makanan, Minuman>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<Makanan, Minuman>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman teh = new Minuman();
        teh.setNamaHidangan("Teh Manis");
        lunch.setKonsumsi(nasi, teh);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi) {
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
