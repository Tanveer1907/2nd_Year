package ete_practice;

public class validate_string {
    public static String validate(String str){
        if(!Character.isLetter(str.charAt(0))){
            return "Invalid";
        }
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                return "Invalid";
            }
        }
        return "Valid";
    }
    public static void main(String[] args) {
        String str = "abc123";
        String result = validate(str);
        System.out.print(result);
    }
}
