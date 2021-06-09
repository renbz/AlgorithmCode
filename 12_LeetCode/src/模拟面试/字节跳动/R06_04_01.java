package 模拟面试.字节跳动;

/**
 * @author Ren
 */

public class R06_04_01 {

    public int balancedStringSplit(String s) {


        int count = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L'){
                flag++;
            }else{
                flag--;
            }
            if(flag==0)  count++;
        }
        return count;
    }

}
