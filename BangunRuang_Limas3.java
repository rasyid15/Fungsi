
package fungsi;

public class BangunRuang_Limas3 {
    public static void main(String[] args) {
        
    int a = 10;
    int t = 5;
    int luas = Limas(a, t);
    
        System.out.println("Luas Limas segitiga = "+luas);
    }
    static int segitiga(int a, int t){
        return a*t/2;
    }
    static int Limas(int a, int t){
        return 4*segitiga(a, t);
    }
}