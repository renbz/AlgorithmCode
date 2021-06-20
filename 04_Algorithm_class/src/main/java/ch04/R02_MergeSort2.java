package ch04;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R02_MergeSort2 {
    public static void main(String[] args) {
        int[] arr = arr(5);
        mergeSort(new int[]{23,25,2,57,48}, 0, arr.length - 1);
    }


    // fen
    public static void mergeSort(int[] list, int first, int last){
        if(null == list || list.length < 0 || first == last){
            return;
        }

        mergeSort(list, first, (last + first)/2);
        mergeSort(list, (last + first)/2 + 1, last);
        sort(list, first, (last + first)/2, last);
    }



    //这个方法是合并两个有序数组 temp数组可以不需要，直接对list 相应位置的元素操作即可
    //那么这么做合并元素就好像直接插入排序算法一样，前半部分数组不动，后半部分数组比较插入
    // he
    public static void sort(int[] list, int first, int mid, int last ){
        int[] temp = new int[last - first + 1];
        int i = 0,j = 0,index = 0;
        while(i < mid - first + 1 && j < last - mid){
            if(list[first + i] >= list[mid + 1 + j]){
                temp[index] = list[mid + 1 + j];
                j++;
                index++;
            } else {
                temp[index] = list[first + i];
                i++;
                index++;
            }
        }
        while(i < mid - first + 1){
            temp[index] = list[first + i];
            index++;
            i++;
        }
        while(j < last - mid){
            temp[index] = list[mid + 1 + j];
            index++;
            j++;
        }
        for(int k = first, n = 0; k <= last; k++, n++){
            list[k] = temp[n];
        }
        System.out.println(Arrays.toString(list));

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
