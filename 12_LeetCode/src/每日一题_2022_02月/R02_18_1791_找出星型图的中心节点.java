package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/18 00:13
 * @Description:
 */

public class R02_18_1791_找出星型图的中心节点 {

    public int findCenter(int[][] edges) {
        if (edges.length == 1) return edges[0][0];
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }

}
