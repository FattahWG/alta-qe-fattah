public class problem_7_mean {
    private static float Mean(float[] numbers){
        float hasil = 0;
        for (int i = 0; i<numbers.length;i++){
            hasil=hasil+numbers[i];
        }
        hasil = hasil/numbers.length;

        return hasil;
    }

    public static void main (String[] Args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
