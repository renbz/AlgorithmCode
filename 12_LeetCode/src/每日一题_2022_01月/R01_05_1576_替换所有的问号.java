package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/5 19:41
 * @Description:
 */

public class R01_05_1576_替换所有的问号 {

    public String modifyString(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++) {
                    if ((i > 0 && arr[i - 1] == ch) || (i < len - 1 && arr[i + 1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }

}
