package Arrays;

// 1832. Check if the sentence is pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
//A pangram is a sentence where every letter of the English alphabet appears at least once.

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for(int i = 0 ; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}

//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        int[] arr = new int[26];
//        for(int i = 0 ; i < sentence.length; i++){
//            char ch = sentence.charAt(i);
//            arr[ch - 'a']++;
//        }
//        for(int i = 0; i < 26; i++){
//            if(arr[i] == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}
