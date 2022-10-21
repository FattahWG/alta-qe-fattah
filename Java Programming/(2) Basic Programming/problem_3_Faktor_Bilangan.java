import java.util.Scanner;
public class problem_3_Faktor_Bilangan {
    public static void main (String[] Args){
        Scanner input = new Scanner(System. in );
        System.out.println("Input angka: ");
        int nilai = input.nextInt();

        System.out.println("Output Faktor: ");
        int faktor = 0;
        for (int z = 0; z <= nilai; z++) {
            faktor++;
            if (nilai % faktor == 0) {
                System.out.print(faktor + " ");
            }
        }

    }

}
