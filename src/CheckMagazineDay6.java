import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Umeshkhatiwada13
 * @created 27/02/2023 6:13 PM
 **/
public class CheckMagazineDay6 {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        boolean publish = true;
        Map<String, Boolean> magazineUseMap = new HashMap<>();
        for (String m : magazine) {
            magazineUseMap.put(m, false);
        }
        for (String s : note) {
            if (magazineUseMap.containsKey(s) && !magazineUseMap.get(s)) {
                magazineUseMap.put(s, true);
            } else {
                publish = false;
                break;
            }
        }
        System.out.println(publish ? "Yes" : "No");
    }

    public static void main(String[] args) {
        checkMagazine(Arrays.asList("two", "times", "three", "is", "not", "four"),
                List.of("two", "times", "two", "is", "four"));
    }
}
