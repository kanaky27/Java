package Arrays;

// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/description/
import java.util.Arrays;
public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(image));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++){
            int left = 0 ,right = n - 1;
            while(left <= right){
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }

}

//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        int n = image.length;
//        for(int i = 0; i < n; i++){
//            int left = 0 ,right = n - 1;
//            while(left <= right){
//                int temp = image[i][left] ^ 1;
//                image[i][left] = image[i][right] ^ 1;
//                image[i][right] = temp;
//
//                left++;
//                right--;
//            }
//        }
//    return image;
//    }
//}
