package 学习计划.数据结构基础.Day14_栈_队列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R1823_找出游戏的获胜者 {

    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + k - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0) + 1;
    }

}
