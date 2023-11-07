package 每日一题_2023_11月;
import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map; /**
* @author Ren - 乔治的哥们
* @Date: 2023/11/5 22:32
* @Description: 
*/

public class R11_05_0187_重复的DNA序列 {
    static final int L = 10;

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        int n = s.length();
        for (int i = 0; i <= n - L; ++i) {
            String sub = s.substring(i, i + L);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }
    
}
