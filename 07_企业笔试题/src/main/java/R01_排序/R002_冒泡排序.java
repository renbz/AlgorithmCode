package R01_排序;

/**
 * @author Ren
 */

public class R002_冒泡排序 {

    //static int[] arr = {1,15,6,21,7,5,13,8,0,4 };
    public static void main(String[] args) {
        print(arr());
    }

    /**
     * 冒泡排序 当数组有序时 立即结束循环
     * @param arr
     */
    static void sort(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int t = arr[i];arr[i]=arr[j];arr[j]=t;
                    count++;
                }
            }
            if(count==0) break;
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
        sort(arr);
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
