package java_2013_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ren
 */
public class Main010_大臣的旅费 {
    private int n;
    private static List<Node>[] g; //图的邻接表
    private static long max = -1 ;
    private static int pnt = -1 ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        g = new List[n+1];
        for (int i = 1; i <= n; i++) {
            g[i]=new ArrayList<Node>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            long c = in.nextLong();
            g[a].add(new Node(b,c));
            g[b].add(new Node(a,c));
        }
        // 以1为根找出一个端点
        dfs(1,1,0);
        dfs(pnt,pnt,0);
        System.out.println(dis2Money(max));
    }
    /**
     * @param from 上一个点的编号
     * @param num  当前点的编号
     * @param dis  历史上积累的距离
     */
    private static void dfs(int from,int num,long dis) {
        boolean isLeaf = true;
        List<Node> neighbors = g[num];
        for (int i = 0; i < neighbors.size(); i++) {
            Node neighbor = neighbors.get(i);
            if(neighbor.num == from) continue;
            isLeaf = false;
            dfs(num,neighbor.num,dis+neighbor.dis);
        }
        if(isLeaf && dis > max){ //是叶子节点
            max = dis;
            pnt = num;
        }
    }
    static long dis2Money(long dis){
        return (dis*dis+21*dis)/2;
    }
    static class Node{
        int num;
        long dis;

        public Node(int num, long dis) {
            this.num = num; // 城市编号
            this.dis = dis; // 到达该城市的距离
        }
    }
}