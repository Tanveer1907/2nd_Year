package ete_practice;

public class sensor_data_peak {
    static int countPoints(int num){
            int points = 0;
            if(num==0){
                return 1;
            }
            while(num>0){
                int digit = num%10;
                if(digit == 0|| digit== 4 || digit == 6 || digit == 9){
                    points+=1;
                }
                else if(digit == 8){
                    points+=2;
                }
                else{
                    points+=0;
                }
                num = num/10;
            }
            return points;
        }
    public static void main(String[] args){
        int num = 624;
        int result = countPoints(num);
        System.out.print(result);
    }
}