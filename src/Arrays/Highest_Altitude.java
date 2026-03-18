package Arrays;
// 1732. Find the highest altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int n = gain.length;

        int max = 0;
        int current = 0;

        for(int i = 0; i < n; i++){
            current = current + gain[i];
            if(current > max){
                max = current;
            }
        }

        return max;
    }
}

//class Solution {
//    public int largestAltitude(int[] gain) {
//        int n = gain.length;
//
//        int max = 0;
//        int current = 0;
//
//        for(int i = 0; i < n; i++){
//            current = current + gain[i];
//            if(current > max){
//                max = current;
//            }
//        }
//
//        return max;
//    }
//}