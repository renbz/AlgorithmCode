package _360; /**
 * @author Ren
 */
import java.util.*;
public class Main01_老师捞我 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();

        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int score = 100;
        int [] res = new int[n];
        //处理n-1
        res[n-1] = score* p+arr[n-1]*q;

        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1]) score--;
            res[i] = score*p+arr[i]*q;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(res[i]>=6000) ans++;
        }
        System.out.println(ans);

    }

}
