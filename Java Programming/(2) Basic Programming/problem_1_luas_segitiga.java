import java.util.Scanner;

public class LuasSegitiga {
    public static void main (String[] args){
        float alas;
        float tinggi;

        double luas;

        Scanner input=new Scanner(System.in);
        System.out.println("Masukan alas: ");
        alas= input.nextFloat();
        System.out.println("Masukan tinggi: ");
        tinggi= input.nextFloat();

        luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: "+luas);
    }
}
