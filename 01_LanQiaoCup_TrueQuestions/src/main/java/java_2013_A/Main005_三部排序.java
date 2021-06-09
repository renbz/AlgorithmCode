package java_2013_A;

/**
 * @author Ren
 */

public class Main005_三部排序 {
    public static void main(String[] args) {

        int[]a = {25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
    static void sort(int[] x){
        int p = 0;
        int left = 0;
        int right = x.length-1;
        while(p<=right){
            if(x[p]<0){
                int t = x[left];
                x[left] = x[p];
                x[p] = t;
                left++;
                p++;
            }
            else if(x[p]>0){
                int t = x[right];
                x[right] = x[p];
                x[p] = t;
                right--;
            }
            else{
                p++;
                //_________________________;  //代码填空位置
            }
        }
    }

}
