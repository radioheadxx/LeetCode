package anagram;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s, t);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        String[] str1 = s.split("");
        String[] str2 = t.split("");

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<str1.length; i++) {
            if(!str1[i].equals(str2[i])) {
                return false;
            }
        }
        return true;
    }

    //   еще одно решение

//    public boolean isAnagram(String s, String t) {
//        char[] charsS = s.toCharArray();
//        char[] charsT = t.toCharArray();
//        Arrays.sort(charsS);
//        Arrays.sort(charsT);
//        if (!Arrays.equals(charsS, charsT)) return false;
//        return true;
//    }
}
