package longest_substring_without_repeating;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int max = 0;
        for(int i = 0; i < chars.length-1; i++) {
            if (chars[i] != chars[i+1]) {
                count++;
                if(count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
