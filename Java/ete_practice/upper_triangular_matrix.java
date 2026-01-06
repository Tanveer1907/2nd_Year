package ete_practice;

public class upper_triangular_matrix {
    static void is_upper(int[][] mat){
        boolean upper = false;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(i>j && mat[i][j] ==0){
                    upper = true;
                }
            }
        }
        if(upper){
            System.out.println("upper triangular matrix");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
is_upper(mat);
        
    }
}
