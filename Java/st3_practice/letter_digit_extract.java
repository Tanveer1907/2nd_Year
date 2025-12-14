package st3_practice;
import java.util.*; 
public class letter_digit_extract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                letter.append(c);
            }
            if(Character.isDigit(c)){
                digit.append(c);
            }
        }
        System.out.println(letter.toString()+digit.toString());
    }
}
