package ete_practice;

public class duplicate_flyer {
    public static void duplicate(String[] arr, int n){
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            boolean printed = false;
            for(int k = 0;k<i;k++){
                if(arr[i].equals(arr[k])){
                    printed = true;
                    break;
                }
            }
            if(count>1 && !printed){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"A123", "B456", "C789", "A123", "D000"};
        int n = 5;
        duplicate(arr, n);
    }
}
