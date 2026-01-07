package ete_practice;

public class rev_words_order {
    public static String reverse_order(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Code Quotient Loves Code";
        String ans = reverse_order(str);
        System.out.print(ans);
    }
}
