package st3_practice;

import java.util.*;

public class mirror_msg {
    public static String reverse(String s, int index){
        if(index == s.length()){
            return "";
        }
        return reverse(s, index+1)+ s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases

        while (T-- > 0) {
            String s = sc.next();
            System.out.println(reverse(s, 0));
        }
    }
}
