package Arrays;
// 1672. Richest customer wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.Arrays;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        for(int[] customer : accounts){
            int currentWealth = 0;
            for (int bank : customer){
                currentWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar,currentWealth);
        }
        return maxWealthSoFar;
    }


}

//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        int maxWealthSoFar = 0;
//        for(int[] customer : accounts){
//            int currentWealth = 0;
//            for (int bank : customer){
//                currentWealth += bank;
//            }
//            maxWealthSoFar = Math.max(maxWealthSoFar,currentWealth);
//        }
//        return maxWealthSoFar;
//    }
//}
