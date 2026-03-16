package Arrays;

// 1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
/*
    Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]
*/

import java.util.*;

public class Target_Array_in_given_order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(index[i],nums[i]);
        }
        int[] target = new int[n];
        for(int i = 0; i < n; i++){
            target[i] = list.get(i);
        }
        return target;
    }
}

//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int n = nums.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            list.add(index[i],nums[i]);
//        }
//        int[] target = new int[n];
//        for(int i = 0; i < n; i++){
//            target[i] = list.get(i);
//        }
//    return target;
//    }
//}