package st3_practice;

import java.util.Scanner;

public class palindrome_vowel_check {
    static boolean valid(String str){
        String clean ="";
        boolean vowel = false;
        for(int i = 0;i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            if(c!=' '){
                clean+=c;
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel =true;
                }
            }
        }
        int l = 0, r = clean.length()-1;
        while(l<r){
            if(clean.charAt(l)!=clean.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return vowel;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();   // consume newline

        while (T-- > 0) {
            String s = sc.nextLine();
            System.out.println(valid(s) ? "VALID" : "INVALID");
        }
    }
}
