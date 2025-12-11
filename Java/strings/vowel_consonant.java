package strings;
import java.util.*;

public class vowel_consonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        str = str.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(int i = 0;i<len;i++){
            char ch = str.charAt(i);
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.print(vowel+" ");
        System.out.print(consonant);
    }
}
