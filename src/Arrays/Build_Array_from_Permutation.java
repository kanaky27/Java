package Arrays;
// 1920. Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/description/


import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0 ;i < n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

// leetcode
//class Solution {
//    public int[] buildArray(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        for (int i = 0 ;i < n;i++){
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }
//}
