package BlindCurated75;

import java.util.*;

/**
 * @author umeshkhatiwada13@infodev
 * @project Leetcode
 * @created 02/10/2023 - 12:40
 */
public class Test {


    public static int getMinMachines(List<Integer> start, List<Integer> end) {
        int n = start.size();
        List<int[]> taskList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            taskList.add(new int[]{start.get(i), end.get(i)});
        }

        taskList.sort(Comparator.comparingInt(i -> i[1]));

        List<Integer> machineList = new ArrayList<>();
        int mCount = 0;

        for (int i = 0; i < n; i++) {
            int startT = taskList.get(i)[0];
            int endT = taskList.get(i)[1];

            boolean assigned = false;
            for (int j = 0; j < mCount; j++) {
                if (startT >= machineList.get(j)) {
                    machineList.set(j, endT);
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                machineList.add(endT);
                mCount++;
            }
        }
        return mCount;
    }

    public static void main(String[] args) {
        List<Integer> start = List.of(2,1,5,5,8);
        List<Integer> end = List.of(5,3,8,6,12);

        int minMachines = getMinMachines(start, end);
        System.out.println("Minimum number of machines required: " + minMachines);
    }

}
