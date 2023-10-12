package Neetcode150.TwoPointers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 11/10/2023 - 22:48
 */
public class ValidParentheses20Easy {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPair = new HashMap<>();
        bracketPair.put('(', ')');
        bracketPair.put('{', '}');
        bracketPair.put('[', ']');
        for (char ch : s.toCharArray()) {
            if (ch == '(' | ch == '{' | ch == '[') {
                stack.push(bracketPair.get(ch));
            } else {
                if (!stack.isEmpty() && Objects.equals(stack.peek(), ch)) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        System.out.println(isValid("{{()}}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));
    }
}
