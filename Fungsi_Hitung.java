package fungsi;
import java.util.Scanner;
public class Fungsi_Hitung {
    public static void hitung(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j ) 
    {
        System.out.println("Total Harga : "+(a+b+c+d+e+f+g+h+i+j));
    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Barang 1 : ");
        int bil1 = input.nextInt();
        
        System.out.println("Barang 2 : ");
        int bil2 = input.nextInt();
        
        System.out.println("Barang 3 : " );
        int bil3 = input.nextInt();
        
        System.out.println("Barang 4 : " );
        int bil4 = input.nextInt();
        
        System.out.println("Barang 5 : " );
        int bil5 = input.nextInt();
        
        System.out.println("Barang 6 : " );
        int bil6 = input.nextInt();
        
        System.out.println("Barang 7 : " );
        int bil7 = input.nextInt();
        
        System.out.println("Barang 8 : " );
        int bil8 = input.nextInt();
        
        System.out.println("Barang 9 : " );
        int bil9 = input.nextInt();
        
        System.out.println("Barang 10 : " );
        int bil10 = input.nextInt();
        
        hitung(bil1, bil2, bil3, bil4, bil5,bil6, bil7, bil8, bil9, bil10 );
        
    }

}