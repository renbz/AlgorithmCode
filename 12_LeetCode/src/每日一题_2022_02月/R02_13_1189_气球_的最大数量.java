package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/13 15:16
 * @Description:
 */

public class R02_13_1189_气球_的最大数量 {

    public int maxNumberOfBalloons(String text) {
        // balloon
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }
        return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o / 2, n))));
    }

}
