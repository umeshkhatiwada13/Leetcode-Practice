import java.util.HashMap;
import java.util.Map;

public class PlusMinus {
    // This method returns plus minus combination plus followed by minus and the same order repeats again
    // based on the input number N
    // For example if N = 5 then output will be +-+-+
    public static String solution(int N) {
        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(0, "+");
        dataMap.put(1, "-");
        StringBuilder finalString = new StringBuilder();
        for (int i = 0;  i< N ; i++){
            int j  = i %2;
            finalString.append(dataMap.get(j));
        }
        return finalString.toString();
    }
    public static void main(String[] args) {

        System.out.println("Final output "+solution(5));
    }
}
