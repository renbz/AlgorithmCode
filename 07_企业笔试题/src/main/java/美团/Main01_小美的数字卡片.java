package 美团; /**
 * @author Ren
 */
import java.util.*;
public class Main01_小美的数字卡片 {

    static int[]arr;
    static int n;
    static TreeSet<String> set = new TreeSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n =in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        f(0);
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
    public static void f(int k){
        if(k==n){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            set.add(sb.toString());
        }
        for (int i = k; i < n; i++) {
            int t = arr[k];arr[k]=arr[i];arr[i]=t;
            f(k+1);
            t = arr[k];arr[k]=arr[i];arr[i]=t;
        }
    }
}
