package ete_practice;

public class voting_consensus {
    static int majority(int[] arr){
        int count = 0;
        int candidate = 0;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majority(arr);
        System.out.println(result);
    }
}
