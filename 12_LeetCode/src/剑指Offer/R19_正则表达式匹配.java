package 剑指Offer;

/**
 * @author Ren
 */

public class R19_正则表达式匹配 {

    public boolean isMatch(String s, String p) {
        // ∵ p中的*可以表示0-n个字符 故将p中的*全部忽略
        String m = p;
        p = replaceStar(p);
        if (p.length() == 0) return true;
        int j = 0;
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            for (j = j; j < s.length(); j++) {
                if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '.') {
                    if (++count == p.length()) return true;
                    break;
                }
            }
        }
        return false;
    }

    //将p中的*及其前面的字符去掉
    public String replaceStar(String p) {

        StringBuilder builder = new StringBuilder();
        for (int i = p.length() - 1; i >= 0; i--) {
            if (p.charAt(i) != '*') {
                builder.append(p.charAt(i));
            } else {
                i--;
            }
        }
        return builder.reverse().toString();
    }

}
