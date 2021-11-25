package 每日一题_2021_11月;

/**
 * @author Ren
 */

public class R11_25_0458_可怜的小猪 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int t = minutesToTest/minutesToDie;
        int x=1;
        while (Math.pow(t+1,x)<buckets){
            x++;
        }
        return x;
    }

}
