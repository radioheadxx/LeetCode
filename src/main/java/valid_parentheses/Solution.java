package valid_parentheses;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        for(int i=0; i < chars.length; i++) {
        }
        return true;
    }
}


class Solution3 {

    public static void main(String[] args) {
        isValid("()[]");
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();


        for(char ch: s.toCharArray())
        {

            switch (ch)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        return stack.isEmpty();

    }
}






























class Solution2 {
    public static void main(String[] args) {
        isValid("()[]");
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char element : chars) {

            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
                continue;
            } else if (stack.empty()) {
                return false;
            }
            char top = stack.pop();
            if (top == '(' && element != ')') {
                return false;
            } else if (top == '[' && element != ']') {
                return false;
            } else if (top == '{' && element != '}') {
                return false;
            }

        }
        return stack.empty();
    }
}