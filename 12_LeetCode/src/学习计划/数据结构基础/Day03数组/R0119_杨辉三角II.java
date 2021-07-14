package 学习计划.数据结构基础.Day03数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0119_杨辉三角II {
    public static void main(String[] args) {
        System.out.println();
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex+1; i++) {
            list.add(0);
            for (int j = i; j >=1; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }

}
