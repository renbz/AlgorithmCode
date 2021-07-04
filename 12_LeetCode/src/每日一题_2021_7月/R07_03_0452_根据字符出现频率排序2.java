package 每日一题_2021_7月;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R07_03_0452_根据字符出现频率排序2 {

    public static void main(String[] args) {
        R07_03_0452_根据字符出现频率排序2 object = new R07_03_0452_根据字符出现频率排序2();
        System.out.println(object.frequencySort("tree"));
    }

    public String frequencySort(String s) {
        if(s == null || s.length() == 0) return "";
        //词频数组
        int[] fre = new int[128];
        for(int i = 0; i < s.length(); i++){
            fre[s.charAt(i)]++;
        }
        //优先级队列（大顶堆）
        //优先比较字符出现频率，频率相同时按字典序排序
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o2.f - o1.f == 0 ? o2.c - o1.c : o2.f - o1.f);

        for(int i = 0; i < 128; i++){
            if(fre[i]!=0){
                Node node = new Node((char) (i),fre[i]);
                queue.offer(node);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            for(int i = 0; i < cur.f; i++){
                sb.append(cur.c);
            }
        }
        return sb.toString();
    }

    class Node {
        char c;
        int f;

        public Node(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }


}
