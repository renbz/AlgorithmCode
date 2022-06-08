package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/8 10:34
 * @Description:
 */

public class R07_08_1037_有效的回旋镖 {

    public boolean isBoomerang(int[][] points) {
        return !(points[0][0] == points[1][0] && points[1][0] == points[2][0] && points[0][1] == points[1][1] && points[1][1] == points[2][1])
                && !((points[2][1] - points[1][1]) * (points[1][0] - points[0][0]) == (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]));
    }

}
