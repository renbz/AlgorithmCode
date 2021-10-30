package 字节跳动.R_2019春招_problems2;

/**
 * @author Ren
 */
import java.util.*;
public class R07_机器人跳跃问题 {
    static int [] arr ;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        // 二分法查找目标值
        int left = 0;
        int right = Integer.MAX_VALUE;
        int count = 0;
        boolean flag = true;
        while(left<right){
            int mid = (left+right)/2;
            flag = f(arr,mid);
            if( flag ){  //为真
                right = mid;
            }else{
                left = mid;
            }
            if(++count == 32){
                if(flag){
                    System.out.println(mid);
                }else{
                    System.out.println(mid+1);
                }
                System.exit(0);
            }
        }
        if(flag){
            System.out.println(left);
        }else{
            System.out.println(left+1);
        }
    }

    public static boolean f(int [] arr,int e){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>e){
                e -= arr[i]-e;
            }else{
                e += e-arr[i];
            }
            if(e<0){
                return false;
            }
        }
        return true;
    }

}
