package Arrays;

// 1431. kids-with-the-greatest-number
// https:leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.*;
public class Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int[] totalCandies = new int[n];
        for (int i = 0; i < n; i++) {
            totalCandies[i] = candies[i] + extraCandies;
            if (totalCandies[i] >= maxCandy) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    }

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int maxCandy = candies[0];
//        for(int i = 1; i < candies.length; i++){
//            if(candies[i] > maxCandy){
//                maxCandy = candies[i];
//            }
//        }
//        int n = candies.length;
//        List<Boolean> ans = new ArrayList<>();
//        int[] totalCandies = new int[n];
//        for(int i = 0;i < n;i++ ){
//            totalCandies[i] = candies[i] + extraCandies;
//            if(totalCandies[i] >= maxCandy){
//                ans.add(true);
//            }else{
//                ans.add(false);
//            }
//        }
//    return ans;
//
//    }
//}