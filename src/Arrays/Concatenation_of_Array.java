package Arrays;

// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/description/

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
    return ans;
    }

}


// class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        for(int i = 0; i < n; i++){
//            ans[i] = nums[i];
//            ans[n+i] = nums[i];
//        }
//    return ans;
//    }
//}