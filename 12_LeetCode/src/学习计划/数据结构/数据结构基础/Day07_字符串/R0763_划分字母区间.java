package 学习计划.数据结构.数据结构基础.Day07_字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0763_划分字母区间 {

    public List<Integer> partitionLabels(String s) {
        int len = s.length();
        int[] indexArr = new int[26];
        // 记录最后一次出现的索引
        for (int i = 0; i < len; i++) {
            indexArr[s.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < len; i++) {
            //end为当前区间的最后一位的索引
            end = Math.max(end, indexArr[s.charAt(i) - 'a']);
            if (end == i) { // 区间内与区间外无元素重复
                list.add(end - start + 1);
                start = end + 1;
            }
        }
        return list;
    }

}
