package Arrays;
import java.util.*;

// 1773. Count Items Matching a Rule
//https://leetcode.com/problems/count-items-matching-a-rule/description/

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        int n = items.size();
        int x = 0 ;
        if(ruleKey.equals("color") ) x = 1;
        else if(ruleKey.equals("name") ) x = 2;
        for(int i = 0; i < n ; i ++){
            if(items.get(i).get(x).equals(ruleValue)) count++;
        }
        return count;

    }
}

//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count = 0 ;
//        int n = items.size();
//        int x = 0 ;
//        if(ruleKey.equals("color") ) x = 1;
//        else if(ruleKey.equals("name") ) x = 2;
//        for(int i = 0; i < n ; i ++){
//            if(items.get(i).get(x).equals(ruleValue)) count++;
//        }
//        return count;
//
//    }
//}