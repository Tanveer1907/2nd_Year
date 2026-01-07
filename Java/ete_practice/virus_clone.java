package ete_practice;

public class virus_clone {
    public static String clone(String str){
        for(int i = 0;i+4<str.length();i++){
            char a = str.charAt(i);
            if(a == 'x' && str.charAt(i+4)=='y' || a =='y' && str.charAt(i+4)=='x'){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        String str = "txma yert";
        String result = clone(str);
        System.out.println(result);

    }
}
