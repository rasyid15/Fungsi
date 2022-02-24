package fungsi;

import java.lang.Math;
import java.util.Scanner;

public class Fungsi_2 {
     
    public static void max(int a, int b, int c) {
        int maks;

        System.out.print("nilai terbesar adalah : ");
        maks = Math.max(a, b);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukan bilangan 1 : ");
        a = input.nextInt();

        System.out.print("Masukan bilangan 2 : ");
        b = input.nextInt();

        System.out.print("Masukan bilangan 3 : ");
        c = input.nextInt();

        max(a, b, c);

    }

}