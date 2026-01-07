package ete_practice;

public class counting_characters {
    public static void countFrequency(String str){
        int[] freq = new int[26];
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                char ch = (char)(i+'a');
                System.out.print(ch+""+freq[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "codequotient";
        countFrequency(str);
    }
}
