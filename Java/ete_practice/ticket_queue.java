package ete_practice;

public class ticket_queue {
    static int frequency(int[] arr, int k){
        int distinct = 0;
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count ==1){
                distinct++;
                if(distinct==k){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {6, 11, 4, 11, 9, 4};
        int k = 2;
        int result = frequency(arr, k);
        System.out.println(result);
    }
}
