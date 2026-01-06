package ete_practice;

public class circular_acl {
    static int control_list(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<=arr[low]){
                if(arr[low]<=target && target<arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[high]){
                    low = mid+1;
                }
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,0,1,2,3,4,5};
        int target = 2;
        int result = control_list(arr, target);
        System.out.println(result);
    }
}
