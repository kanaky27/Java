package Arrays;
// 1295. Find numbers with even number of digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Even_No_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int even_count = 0;
        for(int i =0; i < nums.length; i++){
            if(count(nums[i]) % 2 == 0){
                even_count++;
            }
        }
        return even_count;
    }
    public static int count(int n){
        int count = 0;
        while(n > 0){
            int r = n % 10;
            count++;
            n = n/10;
        }
        return count;
    }

}


//class Solution {
//    public int findNumbers(int[] nums) {
//        int even_count = 0;
//        for(int i =0; i < nums.length; i++){
//            if(count(nums[i]) % 2 == 0){
//                even_count++;
//            }
//        }
//        return even_count;
//    }
//    public int count(int n){
//        int count = 0;
//        while(n > 0){
//            int r = n % 10;
//            count++;
//            n = n/10;
//        }
//    return count;
//    }
//}
