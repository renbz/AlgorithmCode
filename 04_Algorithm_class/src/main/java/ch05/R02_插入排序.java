package ch05;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R02_插入排序 {
    public static void main(String[] args) {
        int [] arr = arr(20);
        System.out.println("排序前\n"+Arrays.toString(arr)+"\n");
        System.out.println("排序过程");
        int [] arr2 = sort(arr);
        System.out.println("排序后\n"+Arrays.toString(arr2));
    }


    /**
     * 插入排序
     * @param arr
     * @return
     */
    public static int[] sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>tmp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tmp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


    /**
     * 生成随机数组
     */
    static int[] arr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
