package ete_practice;

public class brand_logo {
    public static char logo(String husband, String wife){
        int minidx = Integer.MAX_VALUE;
        char logo = 'h';
        for(int i = 0;i<wife.length();i++){
            char ch = wife.charAt(i);
            int idx = husband.indexOf(ch);
            if(idx!=-1 && idx < minidx){
                minidx = idx;
                logo = ch;
            }
        }
        return logo;
    }
    public static void main(String[] args) {
        String husband = "nimish";
        String wife = "seema";
        char result = logo(husband, wife);
        System.out.println(result);
    }
}
