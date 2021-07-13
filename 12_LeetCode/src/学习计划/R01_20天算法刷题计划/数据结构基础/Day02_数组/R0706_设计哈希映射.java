package 学习计划.R01_20天算法刷题计划.数据结构基础.Day02_数组;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R0706_设计哈希映射 {

    class MyHashMap {

        int INF = Integer.MAX_VALUE;
        int N = 1000009;
        int[] map = new int[N];

        public MyHashMap() {
            Arrays.fill(map, INF);
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key] == INF ? -1 : map[key];
        }

        public void remove(int key) {
            map[key] = INF;
        }
    }
}