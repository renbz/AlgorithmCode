package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/31 08:45
 * @Description:
 */

public class R12_31_0507_完美数 {

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num%i==0) sum+=i;
            if(sum>num) return false;
        }
        return sum==num;
    }

}
