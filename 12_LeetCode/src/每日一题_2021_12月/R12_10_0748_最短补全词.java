package 每日一题_2021_12月;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/9 11:41
 * @Description:
 */

public class R12_10_0748_最短补全词 {

    public  String shortestCompletingWord(String licensePlate, String[] words) {
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        licensePlate = licensePlate.toLowerCase(); // 大写转小写
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            //判断是不是字母
            if(!Character.isLetter(licensePlate.charAt(i))) continue;
            map.put(licensePlate.charAt(i),map.getOrDefault(licensePlate.charAt(i),0)+1);
        }
        for (String word : words) {
            Map<Character,Integer> wMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                wMap.put(word.charAt(i),wMap.getOrDefault(word.charAt(i),0)+1);
            }
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : entries) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                if(wMap.getOrDefault(key,0)<value){
                    flag = false;
                    break;
                }
            }
            // 判断长度
            if(flag && minLength>word.length()){
                minLength=word.length();
                ans = word;
            }
        }
        return ans;
    }
}
