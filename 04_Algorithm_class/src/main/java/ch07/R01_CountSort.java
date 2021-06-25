package ch07;

/**
 * @author Ren
 */

public class R01_CountSort {
    static int[] arr = arr(30);
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        getMaxMin();
        countingSort();
    }


    static void getMaxMin() {
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < max ? arr[i] : max;
        }
    }

    static void countingSort() {
        int[] C = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            C[arr[i] - min] = C[arr[i] - min] + 1;
        }
        int k = 0;
        for (int i = 0; i < C.length - 1; i++) {
            for (int j = 0; j < C[i] - 1; j++) {
                arr[k++] = min + i;
            }
        }
    }


    /**
     * 生成随机数组
     */
    static int[] arr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 7);

        }
        return arr;
    }
}
