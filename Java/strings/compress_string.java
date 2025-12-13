package strings;

import java.util.*;
public class compress_string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            StringBuilder result = new StringBuilder();
            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);
                int count =1;
                while(i+1<str.length() && ch == str.charAt(i+1)){
                    count++;
                    i++;
                }
                result.append(ch).append(count);
            }
            System.out.print(result);
        }
    }
    
}