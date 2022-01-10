package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/10 19:30
 * @Description:
 */

public class R01_10_0306_累加数 {

    public boolean isAdditiveNumber(String num) {
        return dfs(num, 0, 0, 0, 0);
    }
    private boolean dfs(String num, int index, int count, long prevprev, long prev) {
        if (index >= num.length()) return count > 2;
        long current = 0;
        for (int i = index; i < num.length(); i++) {
            char c = num.charAt(i);
            if (num.charAt(index) == '0' && i > index) return false; // 剪枝1：不能做为前导0，但是它自己是可以单独做为0来使用的
            current = current * 10 + c - '0';
            if (count >= 2) {
                long sum = prevprev + prev;
                if (current > sum) return false; // 剪枝2：如果当前数比之前两数的和大了，说明不合适
                if (current < sum) continue; // 剪枝3：如果当前数比之前两数的和小了，说明还不够，可以继续添加新的字符进来
            }
            // 当前满足条件了，或者还不到两个数，向下一层探索
            if (dfs(num, i + 1, count + 1, prev, current)) return true;
        }
        return false;
    }
}
