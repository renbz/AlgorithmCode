package questionAll;

/**
 * @author Ren
 */

public class R1221_分割平衡字符串 {



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
