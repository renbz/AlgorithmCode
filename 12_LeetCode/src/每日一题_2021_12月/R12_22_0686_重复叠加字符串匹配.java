package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 10:47
 * @Description:
 */

public class R12_22_0686_重复叠加字符串匹配 {

    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (sb.length() < b.length() && ++ans > 0) sb.append(a);
        sb.append(a);
        int idx = sb.indexOf(b);
        if (idx == -1) return -1;
        return idx + b.length() > a.length() * ans ? ans + 1 : ans;
    }

}
