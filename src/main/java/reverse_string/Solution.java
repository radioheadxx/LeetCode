package reverse_string;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        toReverse("Пайзулаева Райяна");
    }

    public static void toReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        String[] s = reverse.split(" ");

        for(String st : s) {
            StringBuilder sb2 = new StringBuilder(st.toLowerCase());
            sb2.setCharAt(0, Character.toUpperCase(sb2.charAt(0)));
            System.out.print(sb2 + " ");
        }
    }
}
