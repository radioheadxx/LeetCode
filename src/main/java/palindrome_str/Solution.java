package palindrome_str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("аваd fdf f"));
        StringBuilder sb = new StringBuilder("sss dds d");
        sb.reverse();
        System.out.println(sb);

    }
    static boolean isPalindrome(String string) {
        char[] str = string.toCharArray();
        if(str.length == 1) return true;


        int left = 0;
        int right = str.length-1;

        while (left < right) {
            if (str[left] != str[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
