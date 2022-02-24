package fungsi;

public class BangunRuang {

    public static void main(String[] args) {
        int s = 10;
        int luas = luaskubus(s);

        System.out.println(luas);

    }

    static int luaspersegi(int sisi) {
        return sisi * sisi;
    }

    static int luaskubus(int sisi) {
        return 6 * luaspersegi(sisi);

    }

}