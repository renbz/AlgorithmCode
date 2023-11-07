package 每日一题_2023_11月;
import java.util.HashMap;import java.util.Map;import java.util.Set; /**
* @author Ren - 乔治的哥们
* @Date: 2023/11/6 21:34
* @Description: 
*/

public class R11_06_最大单词长度乘积 {

    public int maxProduct(String[] words) {
        Map<Integer,Integer> map = new HashMap<>();

        for (String word : words) {
            int len = word.length(),mask = 0;
            for (int i = 0; i < len; i++) {
                mask |= 1<<(word.charAt(i)-'a');
            }
            if(len>map.getOrDefault(mask,0)){
                map.put(mask,len);
            }
        }
        int maxProd = 0;
        Set<Integer> maskSet = map.keySet();
        for (Integer mask1 : maskSet) {
            Integer wordLen = map.get(mask1);
            for (Integer mask2 : maskSet) {
                if((mask1&mask2)==0){
                    maxProd = Math.max(maxProd,wordLen*map.get(mask2));
                }
            }

        }
        return maxProd;
    }
    
}
