package 每日一题_2022_02月;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/8 09:06
 * @Description:
 */

public class R02_08_1001_网格照明 {

    public static void main(String[] args) {
        R02_08_1001_网格照明 obj = new R02_08_1001_网格照明();
        int[][] lamps = {{1, 1}};
        int[][] queries = {};
        obj.gridIllumination(6, lamps, queries);
        System.out.println();
    }

    int[][] dirs = {{0, 0}, {0, -1}, {0, 1}, {-1, 0}, {-1, -1}, {-1, 1}, {1, 0}, {1, -1}, {1, 1}};
    // 标记位置中被照亮的次数
    Map<String, Integer> map = new HashMap<>();
    Set<String> lampSet = new HashSet<>();

    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        // 将亮着的灯及被照亮的灯加入Map中
        for (int[] lamp : lamps) {
            String point = new StringBuilder().append(lamp[0]).append(',').append(lamp[1]).toString();
            // 同一盏灯 被标记两次处于打开状态，跳过
            if (lampSet.contains(point)) continue;
            // 将亮着灯的行和列及对角线的灯加入Map中,true为新增，false为移除
            h_l_djx(lamp, n, true);
            // 在行和列的灯加入Map中时,自身灯坐标点会重复一次
            map.put(point, map.get(point) - 1);
            // 将自身亮着的灯加入lampSet中
            lampSet.add(point);
        }

        int[] ans = new int[queries.length];
        // 查询灯是否亮着
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            String queryPoint = new StringBuilder().append(x).append(',').append(y).toString();
            if (map.containsKey(queryPoint) && map.get(queryPoint) > 0) ans[i] = 1;
            // 将查询的该点的周围的所有亮着的灯关掉
            for (int[] dir : dirs) {
                x += dir[0];
                y += dir[1];
                String point = new StringBuilder().append(x).append(',').append(y).toString();
                // 如果是自身发光的灯
                if (check(x, y, n, point)) {
                    // 将亮着的灯移除掉
                    lampSet.remove(point);
                    // 将亮着灯的行和列及对角线的灯加入Map中,true为新增，false为移除
                    h_l_djx(new int[]{x, y}, n, false);
                    // 照亮的点在行和列移除时被移除两次,再加回去一次
                    map.put(point, map.get(point) + 1);
                }
                x -= dir[0];
                y -= dir[1];
            }
        }
        return ans;
    }

    private boolean check(int x, int y, int n, String point) {
        return (x >= 0 && x < n && y >= 0 && y < n && lampSet.contains(point));
    }

    private void h_l_djx(int[] lamp, int n, boolean flag) {
        // 将亮着灯的所在行和列的灯加入Map中
        for (int i = 0; i < n; i++) {
            String point1 = new StringBuilder().append(i).append(',').append(lamp[1]).toString();
            String point2 = new StringBuilder().append(lamp[0]).append(',').append(i).toString();
            // 同列被照亮的灯加入Map中,或从Map中移除
            map.put(point1, flag ? map.getOrDefault(point1, 0) + 1 : map.get(point1) - 1);
            // 同行被照亮的灯加入Map中,或从Map中移除
            map.put(point2, flag ? map.getOrDefault(point2, 0) + 1 : map.get(point2) - 1);
        }
        //将亮着灯的所在对角线上的灯加入Map中
        int x = lamp[0], y = lamp[1];
        for (int i = 1; i < n; i++) {
            // 左上
            if (x - i >= 0 && y - i >= 0) {
                String point = new StringBuilder().append(x - i).append(',').append(y - i).toString();
                map.put(point, flag ? map.getOrDefault(point, 0) + 1 : map.get(point) - 1);
            }
            //右上
            if (x - i >= 0 && y + i < n) {
                String point = new StringBuilder().append(x - i).append(',').append(y + i).toString();
                map.put(point, flag ? map.getOrDefault(point, 0) + 1 : map.get(point) - 1);
            }
            //左下
            if (x + i < n && y - i >= 0) {
                String point = new StringBuilder().append(x + i).append(',').append(y - i).toString();
                map.put(point, flag ? map.getOrDefault(point, 0) + 1 : map.get(point) - 1);
            }
            // 右下
            if (x + i < n && y + i < n) {
                String point = new StringBuilder().append(x + i).append(',').append(y + i).toString();
                map.put(point, flag ? map.getOrDefault(point, 0) + 1 : map.get(point) - 1);
            }
        }
    }
}
