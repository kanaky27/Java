package Arrays;
// 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/description/
public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length ;j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

}

//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i; j < nums.length ;j++){
//                if(nums[i] == nums[j] && i < j){
//                    count++;
//                }
//            }
//        }
//    return count;
//    }
//}