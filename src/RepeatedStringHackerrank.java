import java.math.BigInteger;

/**
 * @author Umeshkhatiwada13
 * @created 20/02/2023 5:03 PM
 **/
public class RepeatedStringHackerrank {
    public static long getRepeatedString(String s, long n) {
        if (s.length() == 0) return 0L;
        long length = n / s.length();
        int quotient = (int) (n % s.length());
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            finalString.append(s);
        }
        System.out.println(finalString);
        finalString.append(s, 0, quotient);
        int count = 0;
        for (int i = 0; i < finalString.length(); i++) {
            if (finalString.toString().charAt(i) == 'a') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getRepeatedString("a", 1000000000000L));
    }
}
