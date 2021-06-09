package ch03;

/**
 * @author Ren
 */

public class R03_SeqSearch {

    public static void main(String[] args) {

        int tar = (int) (Math.random()*100);

        int [] arr = arr();
        int index = search(arr,tar);
        System.out.println("\n要查找的目标值"+tar);
        System.out.println(index);
    }


    /**
     * 生成随机数组
     */
    static int[] arr(){
        int [] arr= new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
        return arr;
    }


    /**
     * 查找方法
     */
    static int search(int [] arr, int tar){
        for (int i = 0; i < arr.length; i++) {
            if(tar==arr[i]){
                return i;
            }
        }
        return -1;
    }


}
