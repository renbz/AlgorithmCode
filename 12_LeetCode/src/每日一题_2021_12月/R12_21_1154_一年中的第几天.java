package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/21 09:07
 * @Description:
 */

public class R12_21_1154_一年中的第几天 {

    public int dayOfYear(String date) {
        int[] monDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8, 10));

        int ans = 0;
        for (int i = 0; i < month; i++) {
            ans += monDay[i];
        }
        ans += day;
        if(isRY(year) && month>2) ans+=1;
        return ans;
    }

    boolean isRY(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }


}
