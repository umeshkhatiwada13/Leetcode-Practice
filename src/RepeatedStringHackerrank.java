    import java.math.BigInteger;

    /**
     * @author Umeshkhatiwada13
     * @created 20/02/2023 5:03 PM
     **/
    public class RepeatedStringHackerrank {
        /**
         * Returns the number of times the letter "a" occurs in an infinite string created by repeating a given string.
         * Time Complexity: O(n) - The algorithm iterates through the string s twice, and the time complexity is proportional to the length of s.
         * Space Complexity: O(1) - The additional space used by this algorithm is constant, regardless of the size of the input.
         *
         * @param s the string to repeat infinitely
         * @param n the length of the string to create by repeating s
         * @return the number of times the letter "a" occurs in the infinite string created by repeating s
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
