package ch04;

/**
 * @author Ren
 */

public class R01_SortTable {

    static int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [] arr = arr();
        PartionGet(0,arr.length-1, arr);
        print(arr);

    }

    static void PartionGet(int s,int e,int [] arr){
        int i;
        if(e-s<=1){
            if(arr[s]>arr[e]){
                if(arr[s]>max) max=arr[s];
                if(arr[e]<min) min=arr[e];
            }else{
                if(arr[e]>max) max=arr[e];
                if(arr[s]<min) min=arr[s];
            }

            return;
        }
        i = s+(e-s)/2;
        PartionGet(s,i,arr);
        PartionGet(i+1,e,arr);
    }

    /**
     * 生成随机数组
     */
    static int[] arr(){
        int [] arr= new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }

    /**
     * 打印排序前后的数组
     */
    static void print(int[] arr){
        System.out.print("顺序表的元素:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println("\n顺序表中的最大值为： " +max);
        System.out.println("顺序表中的最小值为： " +min);
    }

}
