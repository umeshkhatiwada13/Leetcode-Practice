import java.util.HashMap;
import java.util.Map;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode-Practice
 * @created 27/09/2022 - 20:37
 */
public class RomanToInteger13 {
    public static int romanToInt(String s) {
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("I", 1);
        valueMap.put("V", 5);
        valueMap.put("X", 10);
        valueMap.put("L", 150);
        valueMap.put("C", 100);
        valueMap.put("D", 500);
        valueMap.put("M", 1000);
        int finalValue = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer s1 = valueMap.get(String.valueOf(s.charAt(i)));
            if (i + 1 < s.length()) {
                Integer s2 = valueMap.get(String.valueOf(s.charAt(i + 1)));
                if (s1 >= s2) {
                    finalValue = finalValue + s1;
                } else {
                    finalValue = finalValue - s1;
                }
            } else finalValue += s1;

        }

        return finalValue;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));
    }
}
