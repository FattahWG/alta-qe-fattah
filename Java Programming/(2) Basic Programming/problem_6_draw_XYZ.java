public class problem_6_draw_XYZ {
    private static void DrawXZY(int n) {
        int mulai = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mulai % 2 == 0) {
                    if (mulai % 3 ==0){
                        System.out.print(" X");
                        mulai=mulai+1;
                    }
                    else{
                    mulai = mulai + 1;
                    System.out.print(" Z");
                    }

                } else if (mulai % 3 == 0) {
                    System.out.print(" X");
                    mulai=mulai+1;
                } else {
                    mulai = mulai + 1;
                    System.out.print(" Y");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] Args){
      DrawXZY(3);
      System.out.println("N=3");
      DrawXZY(5);
      System.out.println("N=5");
      DrawXZY(1);
      System.out.println("N=1");
    }
}
