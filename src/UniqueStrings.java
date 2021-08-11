import java.lang.reflect.Array;
import java.util.*;

public class UniqueStrings {
    public static void main(String[] args) {
        String a = "a,b,b,c";
        String[] ab = a.split(",");
        String[] cd = new String[a.length()];
        List<String> abList = new ArrayList<>();

        Map<String, Integer> duplicateMap = new HashMap<>();
        for (int i = 0; i < ab.length; i++) {
            if (!duplicateMap.containsKey(ab[i])) {
                duplicateMap.put(ab[i], i);
                abList.add(ab[i]);
            }
        }
        System.out.println(Arrays.toString(abList.toArray(cd)));
        System.out.println(Arrays.toString(cd));
    }
}
