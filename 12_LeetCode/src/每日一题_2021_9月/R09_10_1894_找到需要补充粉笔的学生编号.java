package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_10_1894_找到需要补充粉笔的学生编号 {

    public int chalkReplacer(int[] chalk, int k) {
        long kk = k;
        int len = chalk.length;
        long [] sum = new long[len];
        sum[0]=chalk[0];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i-1]+chalk[i];
        }
        kk = kk%sum[len-1];
        for (int i = len-1; i >0 ; i--) {
            if(sum[i]>kk && sum[i-1]<=kk){
                return i;
            }
        }
        return 0;
    }

}
