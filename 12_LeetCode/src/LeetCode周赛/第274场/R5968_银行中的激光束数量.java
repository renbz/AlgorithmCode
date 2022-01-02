package LeetCode周赛.第274场;

import com.sun.javafx.robot.FXRobotImage;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 10:36
 * @Description:
 */

public class R5968_银行中的激光束数量 {

    public int numberOfBeams(String[] bank) {
        //第一行的数量乘第二行的数量
        int[] count = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            int cnt = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') cnt++;
            }
            count[i] = cnt;
        }

        int last = 0, ans = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                ans += last * count[i];
                last = count[i];
            }
        }
        return ans;
    }

}
