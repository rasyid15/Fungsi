package fungsi;

import java.util.Scanner;

public class Fungsi {

    public static void Lingkaran(int Lingkaran) {
        int sisi = 10;

        int a = sisi * sisi;
        System.out.println("Luas persegi = " + a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Panjang = ");
        int p = input.nextInt();
        System.out.println("Lebar = ");
        int l = input.nextInt();
        System.out.println("Luas = " + luasSegiPanjang(p, l));

    }

    public static double luasSegiPanjang(int p, int l) {
        int luas = p * l;
        return luas;
    }
}
