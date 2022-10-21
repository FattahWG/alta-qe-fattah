import java.util.Scanner;

public class Medium_3 {

    private static void Penjumlahan(int x, int y){
        int hasil;
        hasil = x + y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Pengurangan(int x, int y){
        int hasil;
        hasil = x - y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Perkalian(int x, int y){
        int hasil;
        hasil = x * y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Pembagian(int x, int y){
        int hasil;
        hasil = x / y;
        System.out.println("Hasil : " + hasil);
    }

    public static void main(String[] args) {
        String pilih_operasi;
        int angka1 = 0;
        int angka2 = 0;
        double hasil;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("Kalkulator");
        System.out.println("===============================");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan 1/2/3/4: ");
        pilih_operasi = input_pilihan.next();

        System.out.println("Masukkan Angka Pertama: ");
        angka1 = input_pilihan.nextInt();

        System.out.println("Masukkan Angka Kedua: ");
        angka2 = input_pilihan.nextInt();

        if (pilih_operasi.equals("1")) {
            Penjumlahan(angka1,angka2);
        } else if (pilih_operasi.equals("2")) {
            Pengurangan(angka1,angka2);
        } else if (pilih_operasi.equals("3")) {
            Perkalian(angka1,angka2);
        } else if (pilih_operasi.equals("4")) {
            Pembagian(angka1,angka2);
        } else {
            System.out.println("Error!");
        }

    }
}

