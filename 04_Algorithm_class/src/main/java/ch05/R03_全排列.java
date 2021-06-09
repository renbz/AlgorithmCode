package ch05;

/**
 * @author Ren
 */
public class R03_全排列 {

    static int[] arr = {1,2,3,4,5,6};
    public static void main(String[] args) {
        f(0);
    }
    public static void f(int k){
        if(k==arr.length){

            // 插入需要判断执行的业务代码
        }else{
            for (int i = k; i < arr.length; i++) {
                int t = arr[i];arr[i]=arr[k];arr[k]=t;
                f(k+1);
                t = arr[i];arr[i]=arr[k];arr[k]=t;
            }
        }
    }
}