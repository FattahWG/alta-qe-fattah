import java.util.Scanner;

public class problem_2_konversi_nilai {
    public static void main (String[] Args){

        int Nilai;
        Scanner input=new Scanner(System.in);

        System.out.println("Input Nilai: ");
        Nilai=input.nextInt();

        if (Nilai >= 80 && Nilai <=100 ) {
            System.out.println("Nilai A");

        }
            else if (Nilai >= 65 && Nilai <=79 ) {
                System.out.println("Nilai B+");

            }
            else if (Nilai >= 50 && Nilai <=64 ) {
                System.out.println("Nilai C");

            }
            else if (Nilai >= 35 && Nilai <=49 ) {
                System.out.println("Nilai D");

            }
            else if (Nilai >= 0 && Nilai <=34 ) {
                System.out.println("Nilai E");
            }
                else {System.out.println("Invalid");}
    }
}
