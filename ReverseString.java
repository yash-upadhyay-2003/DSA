public class ReverseString {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String str ="Hello Yash";
        System.out.println(reverse(str));
    }
}