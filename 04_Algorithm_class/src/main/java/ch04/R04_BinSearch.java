package ch04;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R04_BinSearch {

    static int [] arr = arr(30);
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        int target = 20;

        int index = binarySearch(target,0,arr.length-1);
        if(index == -1){
            System.out.println("目标值"+target+"值在数组中不存在");
        }else{
            System.out.println("目标值"+target+"在数组中的下标为"+index);
        }

    }


    public static int binarySearch(int target,int left,int right){
        int mid = (left+right)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target && left<=right){
            right = mid-1;
            return binarySearch(target,left,right);
        }
        if(arr[mid]<target && left<=right){
            left = mid+1;
            return binarySearch(target, left, right);
        }
        return -1;
    }


    /**
     * 生成随机数组
     */
    static int[] arr(int length) {
        int[] arr = new int[length];
        arr[0] = (int) (Math.random()*10);
        for (int i = 1; i < length; i++) {
            arr[i] = arr[i-1]+(int) (Math.random() * 4);
        }
        return arr;
    }

}
