package 学习计划.数据结构入门.Day05_数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/21 09:45
 * @Description:
 */

public class R0036_有效的数独 {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row = new HashMap<>(), col = new HashMap<>(),
                area = new HashMap<>();
        // 对于每行、每列、每个单元格 创建HashSet 共27个hashSet
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            area.put(i, new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int u = c - '0'; // 获取当前位置的数值
                int idx = i / 3 * 3 + j / 3; // 找到单元格的位置
                if (row.get(i).contains(u) || col.get(j).contains(u) || area.get(idx).contains(u)) return false;
                row.get(i).add(u);
                col.get(j).add(u);
                area.get(idx).add(u);
            }
        }
        return true;
    }
}
