package ete_practice;

public class caesar_cipher {
    public static String cipher(String str, int key){
        StringBuilder result = new StringBuilder();
        key = key%26;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                char lower = (char)((ch -'a'+key)%26 +'A');
                result.append(lower);
            }
            else if(ch>='A' && ch<='Z'){
                char upper = (char)((ch -'A'+key)%26+'A');
                result.append(upper);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Attack zerg at Down";
        String ans = cipher(str, 3);
        System.out.print(ans);
    }
}
