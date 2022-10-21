public class problem_4_bilangan_prima {
    private static boolean PrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] Args){
        System.out.println(PrimeNumber(11));
        System.out.println(PrimeNumber(13));
        System.out.println(PrimeNumber(17));
        System.out.println(PrimeNumber(20));
        System.out.println(PrimeNumber(35));
    }
}
