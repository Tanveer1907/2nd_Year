package ete_practice;

public class garden_beautiful {
    static int garden(int[] arr){
        int n = arr.length;
        int maxsum = arr[0] + arr[n-1];
        int maxelement =  arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i]>maxelement){
                maxelement= arr[i];
            }
        }
        int sum2 = maxelement+arr[n-1];
        int sum3 = arr[0] + maxelement;
        int answer = maxsum;
        if(sum2>answer){
            answer = sum2;
        }
        if(sum3>answer){
            answer = sum3;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        int result = garden(arr);
        System.out.println(result);
    }
}
