package R04_5月5号;

/**
 * @author Ren
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            int n = in.nextInt();
            int [] arr = new int[n+1];
            boolean [] b = new boolean[n+1];

            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
                map.put(arr[i],i);
            }
            int count = 0;
            for (int i = 0; i <= n; i++) {
                if (i == arr[i]) continue;
                else {
                    int index = map.get(i);
                    int t = arr[i];
                    arr[i] = arr[index];
                    arr[index] = t;
                    count++;
                    map.put(t,index);
                }
            }
            System.out.println(count);
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

