import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueString2 {
    public static String getUniqueWords(String email) {
        Set<String> emailSet = new HashSet<>(Arrays.asList(email.split(",")));
        StringBuilder uniqueString = new StringBuilder();
        int index = 0;
        for (String s : emailSet) {
            uniqueString.append(s);
            if (index < emailSet.size() - 1) uniqueString.append(",");
            index++;
        }
        return uniqueString.toString();
    }

    public static void main(String[] args) {
        System.out.println(getUniqueWords("Hello,world,Hello,world,Nepla"));
    }
}
