package ete_practice;

public class make_array_positive {
    static int positive(int[] arr){
        int flips= 0;
        for(int i = 0;i<arr.length;i++){
            int current = arr[i];
            if(flips%2!=0){
                current = -current;
            }
            if(current<0){
                flips++;
            }
        }
        return flips;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,-7};
        int result = positive(arr);
        System.out.println(result);
    }
}
