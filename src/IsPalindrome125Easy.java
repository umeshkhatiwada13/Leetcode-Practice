/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 08/10/2023 - 15:39
 */
public class IsPalindrome125Easy {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;
        char[] sNew = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase().toCharArray();
        int left = 0;
        int right = sNew.length - 1;
        while (left < right) {
            if (sNew[left] != sNew[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome125Easy isPalindrome125Easy = new IsPalindrome125Easy();
        System.out.println(isPalindrome125Easy.isPalindrome("r@cECar"));
    }
}
