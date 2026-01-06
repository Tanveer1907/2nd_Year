package ete_practice;

public class airport_mishap {
    static int missing(int[] a, int[] b){
        int xor = 0;
        for(int i = 0;i<a.length;i++){
            xor^=a[i];
        }
        for(int i = 0;i<b.length;i++){
            xor^=b[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,4,3,2};
        int result = missing(a, b);
        System.out.println(result);
    }
}
