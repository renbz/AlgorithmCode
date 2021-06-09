package ch02;

/**
 * @author Ren
 */

public class T04_二维数组中的查找 {
    public static void main(String[] args) {
        int [][]arr = { { 1, 2, 3, 4, 5},
                        { 6, 7, 8, 9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}, };
        boolean ans = findEle(13,arr,arr.length,arr[0].length);
        System.out.println(ans);

    }

    static boolean findEle(int num,int[][] arr,int rows,int columns){
        boolean found = false;
        if(arr!=null && rows>0 && columns >0){
            //从右上角开始查找 row=0,column=columns-1
            int row = 0 , column = columns - 1;
            while (row < rows && column >=0){
                if(arr[row][column] == num){
                    found = true;
                    break;
                }else if(arr[row][column] > num){
                    column--;
                }else {
                    row++;
                }
            }
        }
        return found;
    }
}
