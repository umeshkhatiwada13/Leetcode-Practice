import java.math.BigInteger;

/**
 * @author Umeshkhatiwada13
 * @created 20/02/2023 5:03 PM
 **/
public class RepeatedStringHackerrank {
    /**
     * url : https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
     * @param s
     * @param n
     * @return
     */
    public static long getRepeatedString(String s, long n) {
        if (s.length() == 0) return 0L;
        // fullStringRepeatCount represents total number of times the string s will be repeated in the string of length n
        long fullStringRepeatCount = n / s.length();
        // subStringLength represents the remaining part of string in the string of length n after string s are repeated
        // fullStringRepeatCount times
        int subStringLength = (int) (n % s.length());
        long count = 0;
        long repetition;
        // count number of time a is repeated in string s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }
        // if a is repeated count times in string s , it is repeated fullStringRepeatCount times count in infinite string
        repetition = fullStringRepeatCount * count;
        count = 0;
        // count number of times a is repeated in substring of infinite string
        for (int i = 0; i < s.substring(0, subStringLength).length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }
        // total repetition includes previous total count and count of a in substring
        return repetition + count;
    }

    public static void main(String[] args) {
        System.out.println(getRepeatedString("a", 1000000000000L));
    }
}
