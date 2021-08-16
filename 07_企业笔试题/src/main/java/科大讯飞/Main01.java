package 科大讯飞;

/**
 * @author Ren
 */

public class Main01 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回改变后的值
     *
     * @param num int整型 初始正整数
     * @return int整型
     */
    public static int changeNumber(int num) {
        // write code here
        String s = Integer.toBinaryString(num);
        s = "00"+s;
        int count = 2;
        int c = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            c++;
            if(s.charAt(i)=='0') count--;
            if(count==0){
                break;
            }
        }
        return num+(int)Math.pow(2,c);
    }

    public static void main(String[] args) {
        int res = changeNumber(10);
        System.out.println(res);
    }
}
