package BlindCurated75;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 27/09/2023 - 21:06
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        StringBuilder tempS = new StringBuilder();
        int tempL = 0;
        int indexa = 0;
        for (char c : s.toCharArray()) {
            indexa++;
            if (!tempS.toString().contains(String.valueOf(c))) {
                tempS.append(c);
                tempL++;
                if (tempS.length() > length) {
                    length = tempL;
                }
            } else {
                // Case Failed 1
                int index = tempS.lastIndexOf(String.valueOf(c));
                // Case failed 2
                tempS = new StringBuilder().append(tempS.substring(index, tempS.length()));
                tempS.append(c);
                tempL = tempS.length();
            }
        }
        System.out.println(length);
        return length;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
        lengthOfLongestSubstring("bbbbb");
        lengthOfLongestSubstring("abcabcbb");
        // Case failed 1
        lengthOfLongestSubstring("aab");
        // Case Failed 2
        lengthOfLongestSubstring("dvdf");
        // Case failed 3
        lengthOfLongestSubstring("aabaab!bb");
    }
}
