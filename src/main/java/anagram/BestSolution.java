package anagram;

public class BestSolution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "naagaram";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t) {

        int[] n = new int[26];

        for (char c : s.toCharArray()) {
            n[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            n[c - 'a']--;
        }

        for(int a : n) {
            if(a != 0) return false;
        }
        return true;
    }
}
