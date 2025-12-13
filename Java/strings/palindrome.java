package strings;
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            boolean palindrome = false;
            int len = str.length();
            int left = 0;
            int right = len -1;
            for(int i = 0;i<len;i++){
                if(str.charAt(left)==str.charAt(right)){
                    palindrome = true;
                }
                left++;
                right--;
            }
            System.out.println(palindrome);
        }
    }
}
