package fungsi;

public class BangunRuang_Balok {

    public static void main(String[] args) {
       
        int l = 5;
        int s = l;
        int p=20;
        int balok = LuasBalok(s, p, l);

        System.out.println("Luas Balok = " + balok);
    }

    static int Lpersegi(int s) {
        return 2 * s * s;

    }

    static int LpersegiPanjang(int p, int l) {
        return 4 * p * l;

    }

    public static int LuasBalok(int s, int p, int l) {
        return Lpersegi(s)+LpersegiPanjang(p, l);
    }

}