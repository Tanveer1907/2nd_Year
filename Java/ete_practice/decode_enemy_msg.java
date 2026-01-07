package ete_practice;

public class decode_enemy_msg {
    public static String decode(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            for(int j = word.length()-1;j>=0;j--){
                result.append(word.charAt(j));
            }
            if(i!=words.length -1){
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "edoC tneitouQ sevoL edoC";
        String ans = decode(str);
        System.out.print(ans);

    }
}
