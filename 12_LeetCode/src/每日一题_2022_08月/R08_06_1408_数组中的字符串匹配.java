package 每日一题_2022_08月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:35
 * @Description:
 */

public class R08_06_1408_数组中的字符串匹配 {

    public List<String> stringMatching(String[] words) {
        List<String> ret = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ret.add(words[i]);
                    break;
                }
            }
        }
        return ret;
    }

}
