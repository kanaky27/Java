package Arrays;

// 1572. Matrix Diagonal Sum
//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum(mat));

    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];  // primary diagonal
            sum += mat[i][n - 1 - i];   // secondary diagonal
        }
        // Avoid double counting center element (only when n is odd)
        if(n % 2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

}

//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum = 0;
//        int n = mat.length;
//
//        for(int i = 0; i < n; i++){
//            sum += mat[i][i];
//            sum += mat[i][n - 1 - i];
//        }
//        if(n % 2 == 1){
//            sum -= mat[n/2][n/2];
//        }
//        return sum;
//    }
//}


