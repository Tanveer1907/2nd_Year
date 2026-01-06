package ete_practice;

public class datastream {
    static int first_occurence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    static int last_occurence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int last = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }
    static int solve(int[] arr, int target ){
        int f = first_occurence(arr, target);
        if(f == -1) return 0;
        int l = last_occurence(arr, target);
        return l-f+1;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,2,2,4};
        int target = 2;
        int result = solve(arr, target);
        System.out.println(result);
    }
}
