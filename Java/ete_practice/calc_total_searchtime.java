package ete_practice;

public class calc_total_searchtime {
    static int searchtime(int[] arr, int[] queries){
    int totaltime = 0;

    for(int q = 0; q < queries.length; q++){
        int target = queries[q];
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                totaltime += i;   // 0-based index
                found = true;
                break;
            }
        }

        if(!found){
            totaltime += arr.length; // book not found
        }
    }
    return totaltime;
}
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};
        int[] queries = {1,5,2};
        int result = searchtime(arr, queries);
        System.out.println(result);
    }
}
