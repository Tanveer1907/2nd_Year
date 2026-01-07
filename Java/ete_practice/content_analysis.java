package ete_practice;

public class content_analysis {
    public static int count_words(String str){
        str = str.trim();
        if(str.length()==0) return 0;
        int count = 1;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Codequotient get better at coding";
        int result = count_words(str);
        System.out.println(result);
    }
}
