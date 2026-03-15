package Arrays;

import java.util.Arrays;
// 1365. How many numbers are smaller than the current number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class Smaller_Numbers_Than_Current {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(nums[i] > nums[j] && j != i){
                    count[i]++;
                }
            }
        }
        return count;
    }

}


//class Solution {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int n = nums.length;
//        int[] count = new int[n];
//        for(int i = 0; i < n ; i++){
//            for(int j = 0; j < n ; j++){
//                if(nums[i] > nums[j] && j != i){
//                    count[i]++;
//                }
//            }
//        }
//    return count;
//    }
//}