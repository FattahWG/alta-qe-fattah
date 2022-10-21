public class problem_5_palindrome {
    private static boolean palindrome(String value){
        String  kata= "";

        for(int i=value.length();i>0;i--){
            String test1 = value.substring(i-1, i);
            kata += test1;
        }

        if(value.equals(kata)){
            return true;
        }else{
            return false;
        }

    }

    public static void main (String[] Args){
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }

}
