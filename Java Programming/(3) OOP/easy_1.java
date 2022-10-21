import java.util.Scanner;

public class easy_1 {
    private static void persegi(double panjangp, double lebarp) {
        double kelilingp, luasp;
        kelilingp = 2 * panjangp + 2 * lebarp;
        luasp = panjangp * lebarp;
        System.out.println("Persegi luas : "+Math.round(luasp));
        System.out.println("Persegi keliling : "+Math.round(kelilingp));
    }
    private static void Segitiga(double sisi, double alas) {
        double luass, kelilings;
        luass = 0.5 * sisi * alas;
        kelilings = 3 * alas;
        System.out.println("Segitiga luas : "+Math.round(luass));
        System.out.println("Segitiga keliling : "+Math.round(kelilings));
    }
    private static void panjang(double panjang, double lebar) {
        double keliling, luas;
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;
        System.out.println("Persegi Panjang luas : "+Math.round(luas));
        System.out.println("Persegi Panjang keliling : "+Math.round(keliling));

    }

    public static void main(String[] args) {
        System.out.print("Output: \n");
        persegi(4,4);
        Segitiga(3,4);
        panjang(7,8);
    }
}