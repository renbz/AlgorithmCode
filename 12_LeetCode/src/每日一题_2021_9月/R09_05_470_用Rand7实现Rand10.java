package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_05_470_用Rand7实现Rand10 {

    public int rand10() {
        while (true) {
            int ans = (rand7() - 1) * 7 + (rand7() - 1); // 进制转换
            if (1 <= ans && ans <= 40) return ans % 10 + 1;
        }
    }
    public int rand7() {
        return 0;
    }


}
