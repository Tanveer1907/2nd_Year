package st3_practice;
import java.util.*;
public class frequency_char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i =0;i<256;i++){
            if(freq[i]>0){
                System.out.print((char)i+":"+freq[i]+" ");
            }
        }
    }
}
