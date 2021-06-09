package R04_5月5号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            int ans = 0;
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            boolean[] b = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                int t = arr[i];
                int count = 0;
                while (b[t] == false) {
                    b[t] = true;

                    t = arr[t];
                    count++;
                }
                if (count != 0) {
                    ans += count - 1;
                }
            }
            System.out.println(ans);

        }

/*
        for(int i=1; i<=n; i++)
            scanf("%d", &a[i]);
        int ans = 0;
        for(int i=1; i<=n; i++) {
            int t = a[i];  //赋值正确的位置
            int cnt = 0;   //记录交换次数
            while(b[t] == 0) {  //如果此处还没有解决
                b[t] = 1;  //标记此处已经解决
                t = a[t];  //赋值正确的位置
                cnt++;	   //交换次数 +1
            }
            if(cnt!=0)  //若没有需要交换的则不需要更新
                ans += cnt - 1;  //因为是两两交换，所以需要 -1
        }*/
    }
}

