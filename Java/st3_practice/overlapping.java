package st3_practice;

import java.util.Scanner;

public class overlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();   // consume newline

        while (T-- > 0) {
            String comment = sc.nextLine();
            String word = sc.nextLine();

            int count = 0;
            boolean overlap = false;
            int lastend = -1;//stores index of last matched word
            for(int i = 0;i<=comment.length()-word.length();i++){
                boolean match = true;
                for(int j = 0;j<word.length();j++){
                    if(comment.charAt(i+j)!=word.charAt(j)){
                        match = false;
                        break;
                    }
                }
                if(match){
                    count++;
                    if(i<=lastend){
                        overlap= true;
                    }
                    lastend =i+word.length()-1;
                }
            }
            System.out.println(count +" "+ (overlap? "yes":"no"));
        }
    }
}
