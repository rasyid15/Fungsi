package fungsi;

import java.util.Scanner;

public class Aritmatika {

    public static void penjumlahan(int a, int b) {
        System.out.println("Penjumlahan a dan b");
        System.out.println("a + b = " + (a + b));
    }

    public static void pengurangan(int a, int b) {
        System.out.println("Pengurangan a dan b");
        System.out.println("a - b = " + (a - b));
    }

    public static void perkalian(int a, int b) {
        System.out.println("Perkalian a dan b");
        System.out.println("a x b = " + (a * b));
    }

    public static void pembagian(double a, double b) {
        System.out.println("Pembagian a dan b");
        System.out.println("a/b = " + (a / b));
    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("====================");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a = ");
        a = input.nextInt();

        System.out.print("Masukkan nilai b = ");
        b = input.nextInt();
        
        System.out.println("====================");
        penjumlahan(a, b);
        pengurangan(a, b);
        perkalian(a, b);
        pembagian(a, b);
        System.out.println("====================");
    }

}
