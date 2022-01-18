package 每日一题_2022_01月;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/18 09:24
 * @Description:
 */

public class R01_18_0539_最小时间差 {

    public static void main(String[] args) {
        R01_18_0539_最小时间差 obj = new R01_18_0539_最小时间差();
        System.out.println(obj.findMinDifference(Arrays.asList(new String[]{"12:12", "00:13"})));
    }

    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
        if (len > 1440) return 0;
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            ans = Math.min(ans, getMinuter(timePoints.get(i - 1), timePoints.get(i)));
            if (ans == 0) return 0;
        }
        return Math.min(ans, getMinuter("00:00", timePoints.get(0)) + getMinuter(timePoints.get(len - 1), "24:00"));
    }

    int getMinuter(String time1, String time2) {
        return ((time2.charAt(0) - '0') * 10 + (time2.charAt(1) - '0')) * 60 + (time2.charAt(3) - '0') * 10 + (time2.charAt(4) - '0') -
                (((time1.charAt(0) - '0') * 10 + (time1.charAt(1) - '0')) * 60 + (time1.charAt(3) - '0') * 10 + (time1.charAt(4) - '0'));
    }

}
