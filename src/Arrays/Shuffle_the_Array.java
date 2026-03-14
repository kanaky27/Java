package Arrays;
// 1470. shuffle the array
 //https://leetcode.com/problems/shuffle-the-array/description/

import java.util.Arrays;

public class Shuffle_the_Array{
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0; i < n ; i++){
            ans[2*i] = nums[i];  // for even places storing first half (i.e - [2,5,1])
            ans[2*i+1] = nums[i+n];  // for odd places storing second half (i.e - [3,4,7])
        }
        return ans;
    }

}


//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[2*n];
//        for(int i = 0; i < n ; i++){
//           ans[2*i] = nums[i];
//           ans[2*i+1] = nums[i+n];
//        }
//    return ans;
//    }
//}