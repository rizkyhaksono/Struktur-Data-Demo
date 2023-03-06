package praktikum1;

import java.util.Scanner;

public class Segitiga<T> {

    private T alas;
    private T tinggi;

    public int getResultAsInt(T alas, T tinggi) {
        return (int) alas * (int) tinggi / 2;
    }

    public double getResultAsDouble(T alas, T tinggi) {
        return (double) alas * (double) tinggi / 2;
    }

    public T setAlas(T alas) {
        return this.alas = alas;

    }

    public T setTinggi(T tinggi) {
        return this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Segitiga<Integer> luasTipeInt = new Segitiga<Integer>();
        Segitiga<Double> luasTipeDouble = new Segitiga<Double>();

        Scanner scn = new Scanner(System.in);

        System.out.println("""
                === Hitung Luas Segitiga ===
                Mau menampilkan hasil luas dalam bentuk? :
                1. Hasil Integer
                2. Hasil Double
                Masukkan pilihan 1 / 2""");

        int pilihan = scn.nextInt();
        System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutas");

        if (pilihan == 1) {
            int alasT = luasTipeInt.setAlas(scn.nextInt());
            int tinggiT = luasTipeInt.setTinggi(scn.nextInt());
            System.out.println(luasTipeInt.getResultAsInt(alasT, tinggiT));
        } else if (pilihan == 2) {
            double alasT = luasTipeDouble.setAlas(scn.nextDouble());
            double tinggiT = luasTipeDouble.setTinggi(scn.nextDouble());
            System.out.println(luasTipeDouble.getResultAsDouble(alasT, tinggiT));
        }
    }
}
