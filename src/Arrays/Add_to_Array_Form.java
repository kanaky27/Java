package Arrays;
import java.util.*;
// 989. Add to array form of integer
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class Add_to_Array_Form {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }

}

//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> result = new ArrayList<>();
//
//        int i = num.length - 1;
//
//        while (i >= 0 || k > 0) {
//            if (i >= 0) {
//                k += num[i];
//                i--;
//            }
//            result.add(k % 10);
//            k /= 10;
//        }
//        Collections.reverse(result);
//        return result;
//    }
//}
