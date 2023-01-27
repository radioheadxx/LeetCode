package palindrome_numb;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if(x<100 && x%10 == 0){
            return false;
        }
        int invertedNum=0;
        int copyOfX = x;

        while(x != 0) {
            invertedNum = invertedNum * 10 + (x % 10);
            x = x/10;
        }
        return invertedNum == copyOfX;
    }
}
