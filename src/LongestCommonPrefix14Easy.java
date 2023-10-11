import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author umeshkhatiwada13
 * @project Leetcode
 * @created 08/10/2023 - 16:06
 */
public class LongestCommonPrefix14Easy {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder finalStr = new StringBuilder();
        // Sort the array in reverse order based in length
        String[] a = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        if (Objects.equals(a[a.length - 1], "")) return "";
        char[] shortestString = a[0].toCharArray();
        // loop for the length of shortest word
        for (int i = 0; i < shortestString.length; i++) {
            char commonStr = shortestString[i];
            boolean isPresent = true;
            // skipping the 1st element and looping through all elements of the array
            for (int j = 1; j < strs.length; j++) {
                if (a[j].toCharArray()[i] != commonStr) {
                    isPresent = false;
                    break;
                }
            }
            if (isPresent) {
                finalStr.append(commonStr);
            } else break;

        }
        return finalStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }
}
