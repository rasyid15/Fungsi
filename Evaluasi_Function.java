
package fungsi;

import java.lang.Math;
import java.util.Scanner;

public class Evaluasi_Function {
    
     
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

        System.out.print("Masukkan Nilai 1 : ");
        a = input.nextInt();

        System.out.print("Masukan Nilai 2 : ");
        b = input.nextInt();

        System.out.print("Masukan Nilai 3 : ");
        c = input.nextInt();

        max(a, b, c);

    }
}
