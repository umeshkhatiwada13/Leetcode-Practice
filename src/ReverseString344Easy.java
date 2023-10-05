/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 04/10/2023 - 21:33
 */
public class ReverseString344Easy {
    public static void reverseString1(char[] s) {
        int charLoop = s.length - 1;
        char[] revS = new char[s.length];
        for (int i = 0; i <= charLoop; i++) {
            revS[charLoop - i] = s[i];
        }
        s = revS;
        System.out.println(s);
    }

    public static void reverseString2(char[] s) {
        char temp;

        // condition i < s.length/2 is used instead of i < s.length because i have to trave only until half
        // other half is travelled by j from last digit to the middle one.
        // if we leave i < s.length, we will have double swap ie original string instead of reversed one
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println("Final Character " + s.toString());
    }

    public static void main(String[] args) {
        reverseString2("Hello".toCharArray());
    }
}
