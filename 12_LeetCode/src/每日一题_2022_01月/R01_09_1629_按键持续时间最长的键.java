package 每日一题_2022_01月;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 10:20
 * @Description:
 */

public class R01_09_1629_按键持续时间最长的键 {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        char ans = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        for (int i = 1; i < n; i++) {
            char key = keysPressed.charAt(i);
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > maxTime || (time == maxTime && key > ans)) {
                ans = key;
                maxTime = time;
            }
        }
        return ans;
    }
}
