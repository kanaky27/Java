package Arrays;

// 1252. Cells with Odd Values in a Matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class Odd_Values_in_Matrix {
    public static void main(String[] args) {
        int m = 2, n = 3 ;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][c]++;
            }
        }
        int odd = 0;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(matrix[i][j] % 2 != 0){
                    odd++;
                }
            }
        }
        return odd;
    }
}

//class Solution {
//    public int oddCells(int m, int n, int[][] indices) {
//        int[][] matrix = new int[m][n];
//        for (int i = 0; i < indices.length; i++) {
//            int r = indices[i][0];
//            int c = indices[i][1];
//            for (int j = 0; j < n; j++) {
//                matrix[r][j]++;
//            }
//            for (int j = 0; j < m; j++) {
//                matrix[j][c]++;
//            }
//        }
//        int odd = 0;
//        for(int i = 0; i < m ; i++){
//            for(int j = 0; j < n ; j++){
//                if(matrix[i][j] % 2 != 0){
//                    odd++;
//                }
//            }
//        }
//        return odd;
//    }
//}
