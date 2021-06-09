package java_2013_B;

/**
 * @author Ren
 */
import java.util.*;
public class Main008_幸运数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n / 2];
        boolean[] b = new boolean[n / 2];
        int[] t = new int[n / 2];
        int ans = 0;
        //初始化a[],筛选一次之后的数值
        for (int i = 0; i < n/2; i++) {
            a[i] = 2 * i + 1;
        }
        //依次找出幸运数
        for (int i = 1; i < n/2; i++) {   //幸运数在数组a中的索引，依次进行筛选
            for (int j = 0; j < n/2; j++) {
                if (a[i] != 0 && (j + 1) % a[i] == 0) {
                    b[j] = true;
                }
            }
            int k = 0;
            // 将a中元素压缩进t
            for (int j = 0; j < n/2; j++) {
                if (!b[j]) {
                    t[k++] = a[j];
                }
            }
            //重新初始化b[]
            for (int j = 0; j < n/2; j++) {
                b[j] = false;
            }
            //将t[]中元素复制给a
            a = t;
        }
        for (int i = 0; i < n/2; i++) {
            if(a[i]>m && a[i]<n){
                ans++;
            }
            if(a[i]==0) break;
        }
        System.out.println(ans);
    }
}