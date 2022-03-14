package 每日一题_2022_03月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/14 09:20
 * @Description:
 */

public class R03_14_0599_两个列表的最小索引总和 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int ans_num = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }

        for (int i = 0; i < list2.length; i++) {
            if(map.get(list2[i])==null) continue;
            else{
                int num = map.get(list2[i])+i;
                if(num<ans_num){
                    ans_num = num;
                    ans.clear();
                    ans.add(list2[i]);
                }else if(num==ans_num){
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[0]);
    }

}
