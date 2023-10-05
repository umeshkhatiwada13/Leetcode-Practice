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

    public static void main(String[] args) {
        System.out.println("Is anagram " + isAnagram("anagram", "anagrm"));
    }
}
