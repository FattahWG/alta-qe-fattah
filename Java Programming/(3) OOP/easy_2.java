import java.util.Scanner;
public class easy_2 {
    private static void kubus(int x){
        int hasil;
        hasil = x*x*x;
        System.out.println("Volume Kubus: "+hasil);

    }
    private static void balok(int x, int y, int z){
        int hasil;
        hasil = x*y*z;
        System.out.println("Volume balok: "+hasil);

    }
    private static void tabung(int x, int y){
        double hasil;
        hasil =3.14*x*x*y;
        System.out.println("Volume tabung: "+hasil);

    }

    public static void main(String[] args){
        kubus(10);
        balok(3,6,10);
        tabung(7,10);
    }

}
