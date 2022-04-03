package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:03
 * @Description:
 */

public class R04_03_0744_寻找比目标字母大的最小字母 {

    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length, l = 0, r = len - 1;
        if (target >= letters[len - 1]) {
            return letters[0];
        }
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (letters[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return letters[l];
    }

}
