package 网易互联网;

/**
 * @author Ren
 */

import java.util.*;

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
                {5800,9000}
        };

        ArrayList<int[]> arr = f(a);
        //输出
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)[0] + "  " + arr.get(i)[1] + " \n");
        }
    }
    public static ArrayList<int[]> f(int[][] t) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(t, (t1, t2) ->{
            return t1[0] != t2[0] ? t1[1] - t2[1] : t1[0] - t2[0];
        });
        // 如果前数组的第二个元素 减 后一个数组的第一个元素大于 -1  就可以连接
        int begin = t[0][0];
        int end = t[0][1];

        System.out.println("--------");
        for (int i = 1; i < t.length; i++) {
            if (t[i][0] - t[i - 1][1] <= 1) {
                end = end > t[i][1] ? end : t[i][1];

            }else if (i< t.length) {
                list.add(new int[]{begin, end});
                begin = t[i][0];
                end = t[i][1];
            }
            if(i==t.length-1){
                list.add(new int[]{begin, end});
            }
        }
        return list;
    }
}