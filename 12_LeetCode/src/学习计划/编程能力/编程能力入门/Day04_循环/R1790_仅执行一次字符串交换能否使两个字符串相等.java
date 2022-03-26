package 学习计划.编程能力.编程能力入门.Day04_循环;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/26 23:32
 * @Description:
 */

public class R1790_仅执行一次字符串交换能否使两个字符串相等 {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() == s2.length()) {
            if (s1.equals(s2)) return true;
            int count = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    builder.append(s1.charAt(i)).append(s2.charAt(i));
                    count++;
                }
            }
            return count == 2 && builder.charAt(0) == builder.charAt(3) && builder.charAt(1) == builder.charAt(2);
        }
        return false;
    }

}
