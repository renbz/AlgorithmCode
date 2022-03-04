package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/2 21:20
 * @Description:
 */

public class R0007_整数反转 {

    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

}
