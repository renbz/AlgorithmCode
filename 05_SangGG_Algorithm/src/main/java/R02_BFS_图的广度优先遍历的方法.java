import sun.security.provider.certpath.Vertex;

import java.util.LinkedList;

/**
 * @author Ren
 */

public class R02_BFS_图的广度优先遍历的方法 {

    public static void main(String[] args) {

    }
/*

    //对一个节点进行广度优先遍历的方法
    private void bfs(boolean[] isVisited , int i){
        int u;  //表示列的头节点对应的下标
        int w;  // 邻接节点w
        // 需要队列，记录节点访问的顺序
        LinkedList<Object> queue = new LinkedList<>();
        //访问节点 输出节点信息
        System.out.println(getValueByIndex(i) + "=>");
        // 标记为已访问
        isVisited[i] = true;
        // 将节点加入队列
        queue.addLast(i);

        while (!queue.isEmpty()){
            // 取出头节点下标
            u = (Integer) queue.removeFirst();
            // 得到第一个邻接点的w
            w = getFirstNeighbor(u);
            while (w!=-1){
                // 找到
                // 是否访问过
                if(!isVisited[w]){
                    System.out.println(getValueByIndex(w) + "=>");
                    //标记已经访问
                    isVisited[w] = true;
                    //入队
                    queue.addLast(w);
                }
                // 以u为前驱点 找w后面的下一个邻接点
                w = getNextNeighbor(u,w); // 体现出我们的广度优先

            }
        }

    }

    //遍历所有的结点，都进行广度优先搜索
    public void bfs(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]){
                bfs(isVisited,i);
            }
        }
    }



    public int getNumOfVertex(){
        return VertexList.size();
    }*/

}
