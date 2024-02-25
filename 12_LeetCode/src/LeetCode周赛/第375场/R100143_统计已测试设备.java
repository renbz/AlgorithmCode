package LeetCode周赛.第375场;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2023/12/10 10:30
 * @Description:
 */

public class R100143_统计已测试设备 {


    public int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int testedDevices = 0;

        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                testedDevices++;
                for (int j = i + 1; j < n; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }

        return testedDevices;
    }

}
