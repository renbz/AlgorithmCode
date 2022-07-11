package 每日一题_2022_07月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/11 20:10
 * @Description:
 */

public class R07_11_0676_实现一个魔法字典 {

    class MagicDictionary {
        private String[] words;

        public MagicDictionary() {

        }

        public void buildDict(String[] dictionary) {
            words = dictionary;
        }

        public boolean search(String searchWord) {
            for (String word : words) {
                if (word.length() != searchWord.length()) {
                    continue;
                }

                int diff = 0;
                for (int i = 0; i < word.length(); ++i) {
                    if (word.charAt(i) != searchWord.charAt(i)) {
                        ++diff;
                        if (diff > 1) {
                            break;
                        }
                    }
                }
                if (diff == 1) {
                    return true;
                }
            }
            return false;
        }
    }

}
