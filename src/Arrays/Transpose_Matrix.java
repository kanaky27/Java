package Arrays;
import java.util.Arrays;

// 867. Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/description/
public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));

    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transpose = new int[c][r];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}

//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int[][] transpose = new int[c][r];
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                transpose[j][i] = matrix[i][j];
//            }
//        }
//    return transpose;
//    }
//}
