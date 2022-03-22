package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/22 09:28
 * @Description:
 */

public class R03_22_2038_如果相邻两个颜色均相同则删除当前颜色 {

    public boolean winnerOfGame(String colors) {
        int orgLen = colors.length();
        while (colors.length() > 2 && colors.contains("AAA")) {
            colors = colors.replaceAll("AAA", "AA");
        }
        int currLen1 = orgLen - colors.length();
        while (colors.length() > 2 && colors.contains("BBB")) {
            colors = colors.replaceAll("BBB", "BB");
        }
        int currLen2 = orgLen - currLen1 - colors.length();
        return currLen1 > currLen2;
    }

    public boolean winnerOfGame2(String colors) {
        int n = colors.length(), count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1) && colors.charAt(i) == colors.charAt(i + 1)) {
                count += colors.charAt(i) == 'A' ? 1 : -1;
            }
        }
        return count > 0;

    }
}
