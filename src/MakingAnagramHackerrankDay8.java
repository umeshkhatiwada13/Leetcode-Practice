import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Umeshkhatiwada13
 * @created 07/03/2023 2:02 PM
 **/
public class MakingAnagramHackerrankDay8 {
    public static int makeAnagram(String a, String b) {
        return 0;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        makeAnagram("abc", "abd");
    }

    @Test
    public void test() {
        assertEquals(0, makeAnagram("abc", "abc"));
    }
}
