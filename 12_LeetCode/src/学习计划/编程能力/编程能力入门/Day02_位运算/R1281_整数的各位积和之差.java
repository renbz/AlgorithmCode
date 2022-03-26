package 学习计划.编程能力.编程能力入门.Day02_位运算;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/24 10:10
 * @Description:
 */

public class R1281_整数的各位积和之差 {

    public int subtractProductAndSum(int n) {
        int cj = 1, sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            cj *= num;
            n = n / 10;
        }
        return cj - sum;
    }
}
