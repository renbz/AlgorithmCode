package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_12_0678_有效的括号字符串 {


    public boolean checkValidString(String s) {
        return isTrue1(s) && isTrue2(new StringBuilder(s).reverse().toString());
    }

    boolean isTrue1(String s) {
        int star = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') star++;
            if (s.charAt(i) == '(') num++;
            if (s.charAt(i) == ')') {
                num--;
                if (star + num < 0) return false;
            }
        }
        return star + num >= 0;
    }

    boolean isTrue2(String s) {
        int star = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') star++;
            if (s.charAt(i) == '(') {
                num--;
                if (star + num < 0) return false;
            }
            if (s.charAt(i) == ')') num++;
        }
        return star + num >= 0;
    }

    public static void main(String[] args) {
        System.out.println(1>2?5:5+" ");
    }
}
