package ete_practice;

public class genetic_sequence {
    public static String frequency(String str){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1));
                if(count>1){
                    result.append(count);
                }
                count = 1;
            }}
            result.append(str.charAt(str.length()-1));
            if(count>1){
                result.append(count);
            }
        
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbccc";
        String ans = frequency(str);
        System.out.print(ans);
    }
}