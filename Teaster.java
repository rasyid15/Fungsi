
package fungsi;
import java.util.Scanner;
public class Teaster {
    public static void hitung(int a, int b) {
        System.out.println("Hasil : "+(a+b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bilangan 1 : ");
        int bil1=input.nextInt();

        System.out.println("Bilangan 2 : ");
        int bil2 = input.nextInt();
        
        hitung(bil1, bil2);
    }
}
