/**
 @author: rizkyhaksono
 */

package praktikum1;

import java.util.Scanner;

public class Segitiga<T> {

    private final T alas;
    private final T tinggi;

    Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        return (int) this.alas * (int) this.tinggi / 2;
    }

    public double getResultAsDouble() {
        return (double) this.alas * (double) this.tinggi / 2;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println(
                    "=== Hitung Luas Segitiga ===" +
                            "\nMau menampilkan hasil luas dalam bentuk? :" +
                            "\n1. Hasil Integer" +
                            "\n2. Hasil Double" +
                            "\nMasukkan pilihan 1 / 2");

            int pilihan = scn.nextInt();
            System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutas");

            if (pilihan == 1) {
                int alasInt = scn.nextInt();
                int tinggiInt = scn.nextInt();
                Segitiga<Integer> luasTipeInt = new Segitiga<>(alasInt, tinggiInt);
                System.out.println("Luas segitiga dalam Integer : " + luasTipeInt.getResultAsInt());
            } else if (pilihan == 2) {
                double alasDouble = scn.nextDouble();
                double tinggiDouble = scn.nextDouble();
                Segitiga<Double> luasTipeDouble = new Segitiga<>(alasDouble, tinggiDouble);
                System.out.println("Luas segitiga dalam Double : " + luasTipeDouble.getResultAsDouble());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
