package 学习计划.剑指Offer专项突击版.Day10_11_哈希表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 21:01
 * @Description:
 */

public class 剑指OfferII_034_外星语言是否排序 {

    public boolean isAlienSorted(String[] words, String order) {
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            String str1 = words[i - 1];
            String str2 = words[i];
            int len1 = str1.length(), len2 = str2.length();
            for (int j = 0; j < Math.max(len1, len2); j++) {
                int idx1 = j < len1 ? arr[str1.charAt(j) - 'a'] : -1;
                int idx2 = j < len2 ? arr[str2.charAt(j) - 'a'] : -1;
                if (idx1 < idx2) break;
                if (idx1 > idx2) return false;
            }
        }
        return true;
    }

}
