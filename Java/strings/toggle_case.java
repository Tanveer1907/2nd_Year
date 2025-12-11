package strings;
import java.util.*;
public class toggle_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(result.toString());
    }
}
