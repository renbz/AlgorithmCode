package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/17 20:05
 * @Description:
 */

public class R2413_最小偶倍数 {

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }

}
