package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 09:44
 * @Description:
 */

public class LCP29_乐团站位 {

    public int orchestraLayout(int num, int xPos, int yPos) {
        long circle = Math.min(Math.min(xPos, yPos), Math.min(num - 1 - xPos, num - 1 - yPos));
        long seq = 4 * (num - circle) * circle;
        long side = num - 2 * circle - 1, xVertex = circle, yVertex = circle;

        if (xPos == xVertex && yPos < yVertex + side) {
            seq += (long) yPos + 1 - yVertex;
        } else {
            seq += side;
            if (yPos == yVertex + side && xPos < xVertex + side) {
                seq += (long) xPos + 1 - xVertex;
            } else {
                seq += side;
                if (xPos == xVertex + side && yPos > yVertex) {
                    seq += (yVertex + side + 1 - yPos);
                } else {
                    seq += (side + xVertex + side + 1 - xPos);
                }
            }
        }
        seq %= 9;
        return (int) (seq == 0 ? 9 : seq);
    }
}
