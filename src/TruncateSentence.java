import java.util.ArrayList;
import java.util.List;

//Leetcode problem 1816. Truncate Sentence
public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder(strings.length);
        for (int i = 0; i < strings.length; i++) {
            if (i < k) sb.append(strings[i]).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println("I am in");
        System.out.println("String is " + truncateSentence("Hello World I am me", 3));
    }
}
