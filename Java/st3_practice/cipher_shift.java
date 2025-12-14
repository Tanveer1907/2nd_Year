package st3_practice;
import java.util.*;
public class cipher_shift {
    public static String decode(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int val = s.charAt(i) - 'a';
            val = val - i;

            if(val<0){
                val+=26;
            }

            char decoded = (char)(val +'a');
            result.append(decoded);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            System.out.println(decode(s));
        }
    }
}
