package Concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 11/10/2023 - 21:36
 */
public class StackPractice {
    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        Map<Character, Character> bracketPair = new HashMap<>();
        bracketPair.put(']', '[');
        bracketPair.put(')', '(');
        bracketPair.put('}', '{');
        int count = 0;
        for (char c : s.toCharArray()) {
            if (count % 2 == 0) {
                charStack.push(c);
            } else {
                if (Objects.equals(bracketPair.get(c), charStack.peek())) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
            count++;
        }
        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack.peek());
        System.out.println(isValid("[]{)"));
    }
}
