import java.util.HashMap;
import java.util.Map;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 04/10/2023 - 20:38
 */
public class IsAnagram242Easy {
    // cat and tac are anagram
    // apple and ppael are anagram
    // they have same characters and each character are repeated for same number of times
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (sMap.containsKey(c) && sMap.get(c) > 0) {
                sMap.put(c, sMap.get(c) - 1);
            } else return false;
        }
        return true;
    }

    //Second approach to solve the same question
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] char_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < char_count.length; i++) {
            if (char_count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is anagram " + isAnagram("anagram", "anagrm"));
    }
}
