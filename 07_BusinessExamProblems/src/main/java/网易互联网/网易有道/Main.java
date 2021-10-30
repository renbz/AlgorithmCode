package 网易互联网.网易有道;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] a = new int[][]{
                {1, 2},
                {2, 3},
                {3, 6},
                {4, 5},
                {7, 9},
                {2000,3000},
                {5000, 6000},
                {100,9000}
        };

        ArrayList<int[]> arr = merge(a);
        //输出
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)[0] + "  " + arr.get(i)[1] + " \n");
        }
    }

    public static ArrayList<int[]> merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            int l = intervals[i][0];
            int r = intervals[i][1];

            while (i < intervals.length - 1 && intervals[i + 1][0] <= r) {
                i++;
                r = Math.max(r,intervals[i][1]);
            }
            list.add(new int[]{l,r});
            i++;
        }
        return list;
    }
}