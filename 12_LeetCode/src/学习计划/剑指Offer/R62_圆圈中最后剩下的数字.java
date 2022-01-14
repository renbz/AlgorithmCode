package 学习计划.剑指Offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 15:43
 * @Description:
 */

public class R62_圆圈中最后剩下的数字 {

    public int lastRemaining(int n, int m) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) list.add(i);
        int index = 0;
        while (list.size() > 1) {
            index = (index + (m - 1)) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}
