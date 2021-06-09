package ch03;

/**
 * @author Ren
 */

public class R01_SelectSort {

    //static  int[] arr = {1,3,6,5,7,5,9,8,0,4 };
    public static void main(String[] args) {
        print(arr());  //打印排序前后的数组
    }

    /**
     * 选择排序
     * @param arr
     */
    static void selectSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i; //记录数组中最小值的下标
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[index]) index = j;
            }
            //交换元素
            int t = arr[index]; arr[index]= arr[i] ; arr[i] = t;
        }
    }

    /**
     * 打印排序前后的数组
     */
    static void print(int[] arr){
        System.out.print("排序前的数列:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        selectSort(arr);
        System.out.print("\n排序后的数列:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }


    /**
     * 生成排序数组
     */
    static int[] arr(){
        int [] arr= new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }

}
