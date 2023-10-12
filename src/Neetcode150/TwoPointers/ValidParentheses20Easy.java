package Neetcode150.TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 11/10/2023 - 22:48
 */
public class ValidParentheses20Easy {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Map<Character, Integer> bracketCounter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char[] sArray = s.toCharArray();
            Map<Character, Character> bracketPair = new HashMap<>();
            bracketPair.put(']', '[');
            bracketPair.put(')', '(');
            bracketPair.put('}', '{');
            if (i < s.length() / 2) {
                bracketCounter.put(sArray[i], bracketCounter.getOrDefault(sArray[i], 0) + 1);
            } else {
                bracketCounter.put(bracketPair.get(sArray[i]), bracketCounter.getOrDefault(bracketPair.get(sArray[i]), 0) > 0 ? bracketCounter.getOrDefault(bracketPair.get(sArray[i]), 0) - 1 : 0);
            }
        }
        int sum = 0;
        for (Map.Entry<Character, Integer> a : bracketCounter.entrySet()) {
            sum += a.getValue();
        }
        return sum == 0;
    }

    public static void main(String[] args) {
//        System.out.println(isValid("{{()}}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));
    }
}
