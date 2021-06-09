package ch04;

/**
 * @author Ren
 */

public class R02_MergeSort {
    public static void main(String[] args) {
        int[] arr = arr();
        int[] arr1 = new int[arr.length];
        print(arr);
        mergeSort(arr, arr1, 0, arr.length - 1);
        System.out.println();
        print(arr1);
    }

    static void mergeSort(int[] r, int[] r1, int s, int t) {
        int m = (s + t) / 2;
        //递归出口
        if (s == t) {
            r1[s] = r[s];
        } else {
            mergeSort(r, r1, s, m);
            mergeSort(r, r1, m + 1, t);
            merge(r1, r, s, m, t);
        }
    }

    static void merge(int[] r, int[] r1, int s, int m, int t) {
        int i = s, j = m + 1, k = s;
        while (i <= m && j <= t) {
            if (r[i] <= r[j]) r1[k++] = r[i++];
            else r1[k++] = r[j++];
        }
        if (i <= m) {
            while (i <= m) {
                r1[k++] = r[i++];
            }
        } else {
            while (j <= t) {
                r1[k++] = r[j++];
            }
        }

    }


    /**
     * 生成随机数组
     */
    static int[] arr() {
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    /**
     * 打印排序前后的数组
     */
    static void print(int[] arr) {
        System.out.print("顺序表的元素:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


}
