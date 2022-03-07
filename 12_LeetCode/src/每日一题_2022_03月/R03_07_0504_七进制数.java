package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/7 09:10
 * @Description:
 */

public class R03_07_0504_七进制数 {

    public String convertToBase7(int num) {
        StringBuilder ans = new StringBuilder();
        if (num == 0) return "0";
        int num2 = num;
        num = Math.abs(num);
        while (num != 0) {
            ans.append(num % 7);
            ans.append(num / 7);
            num /= 7;
        }
        return num2 > 0 ? ans.reverse().toString() : "-" + ans.reverse();
    }

}
