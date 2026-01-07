package ete_practice;

public class capitalize_1st_letter {
    public static String capitalize(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i==0 && Character.isLetter(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else if(str.charAt(i-1)==' ' && Character.isLetter(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        String ans = capitalize(str);
        System.out.print(ans);
    }

}
