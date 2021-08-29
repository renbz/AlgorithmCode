package 网易互娱;

/**
 * @author Ren
 */

import java.util.*;

public class Main01_魔塔大冒险 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            // 怪物数量
            int N = in.nextInt();
            //  主角攻击力和防御力
            int A = in.nextInt(), B = in.nextInt();

            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                arr[i][0] = in.nextInt();  // 攻击力
                arr[i][1] = in.nextInt();  // 防御力
                arr[i][2] = in.nextInt();  // 生命值
            }

            //求通关最小生命值
            /*
                如果任何一个怪物的防御力大于主角的攻击力，
                那么永远不会通关。
            */
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (arr[i][1] >= A) {  // 攻击力
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(-1);
            } else {

                // 倒着推，假设最后剩余生命值为1
                int ans = 1;
                if (N>=1) {
                    //for (int i = N - 1; i >= 0; i--) {
                    int i = N - 1;
                    //每次攻击对怪兽的伤害
                    int sh_send = A - arr[i][1];
                    // 怪兽对主角的伤害
                    int sh_get = arr[i][0] - B;
                    // 攻击次数
                    int count_send = arr[i][2] % sh_send == 0 ? arr[i][2] / sh_send : arr[i][2] / sh_send + 1;
                    //  受到攻击次数
                    int count_get = count_send - 1;
                    ans += sh_get * count_get;
                }
                for (int i = N - 2; i >= 0; i--) {
                    //每次攻击对怪兽的伤害
                    int sh_send = A - arr[i][1];
                    // 怪兽对主角的伤害
                    int sh_get = arr[i][0] - B;
                    // 攻击次数
                    int count_send = arr[i][2] % sh_send == 0 ? arr[i][2] / sh_send : arr[i][2] / sh_send + 1;
                    //  受到攻击次数
                    int count_get = count_send - 1;

                    if (count_send - arr[i][2] / sh_send == 1) {
                        ans -= (count_send) * sh_send - arr[i][2];
                    }
                    ans += sh_get * count_get;
                }
                if(ans<=0)
                    System.out.println(1);
                else System.out.println(ans);
            }
        }
    }
}
