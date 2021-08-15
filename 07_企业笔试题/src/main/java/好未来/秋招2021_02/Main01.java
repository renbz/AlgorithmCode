package 好未来.秋招2021_02;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class Main01 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param array int整型一维数组 数组
     * @param n     int整型 数组长度
     * @param k     int整型 k值
     * @return int整型
     */
    public static int findK(int[] array, int n, int k) {
        // write code here
        Arrays.sort(array);
        for (int i = n - 1; i >= 0; i--) {
            if (k == 1) return array[i];
            if (i - 1 >= 0 && array[i] > array[i - 1]) {
                k--;
            }
        }
        return array[0];
    }

    public int findK2(int[] array, int n, int k) {
        // write code here
        Arrays.sort(array);
        return array[n - k];
    }

    public static int findK3(int[] array, int n, int k) {
        // write code here
        PriorityQueue<Integer> minHeap = new PriorityQueue(k);
        for (int i = 0; i <= k; i++) {
            minHeap.add(array[i]);
        }
        for (int i = k + 1; i < n; i++) {
            minHeap.poll();
            minHeap.add(array[i]);
        }
        return minHeap.poll();
    }

    public static void main(String[] args) {
        int ans = findK3(new int[]{1, 3, 5, 2, 2}, 5, 3);
        System.out.println(ans);
    }

}
