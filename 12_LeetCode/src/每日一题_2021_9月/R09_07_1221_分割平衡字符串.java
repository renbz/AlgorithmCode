package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_07_1221_分割平衡字符串 {

    public int balancedStringSplit(String s) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L'){
                num--;
            }else{
                num++;
            }
            if(num==0) count++;
        }
        return count;
    }

}
