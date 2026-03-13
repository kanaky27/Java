package Arrays;
// 1480. running-sum-of-1d-array
// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class Running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        int sum = 0;
        for(int i = 0 ;i < n;i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}



//class Solution {
//    public int[] runningSum(int[] nums) {
//        int n = nums.length;
//        int[] runningSum = new int[n];
//        int sum = 0;
//        for(int i = 0 ;i < n;i++){
//            sum += nums[i];
//            runningSum[i] = sum;
//        }
//    return runningSum;
//    }
//}