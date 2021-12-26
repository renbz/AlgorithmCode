package 每日一题_2021_12月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/26 09:37
 * @Description:
 */

public class R12_26_1078_Bigram分词 {

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();
        if(words.length<3) return new String[]{};
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                ans.add(words[i + 2]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

}
