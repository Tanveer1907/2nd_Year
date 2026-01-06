package ete_practice;

public class last_occurence {
    static int lastoccurence(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==target){
                result = mid;
                left = mid+1;
            }
            else if(arr[mid]<target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result;
    }
    static int solve(int[] arr, int[] queries){
        int sum  = 0;
        for(int i = 0;i<queries.length;i++){
            int idx = lastoccurence(arr, queries[i]);
            sum+=idx;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr ={6,5,5,5,4,2,2};
        int[] queries ={5,2,6};
        int result = solve(arr, queries);
        System.out.println(result);
    }
}
