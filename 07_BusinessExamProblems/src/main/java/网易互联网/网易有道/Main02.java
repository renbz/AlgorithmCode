package 网易互联网.网易有道;

/**
 * @author Ren
 */

public class Main02 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回Sn的第k位字符
     *
     * @param n int整型 Sn的n
     * @param k int整型 需要返回的字符下标位
     * @return char字符型
     */
    public char findKthBit(int n, int k) {
        // write code here
        //获取字符串
        char c = (char) (n - 97);

        // Si = S(i-1)+Li+Reverse(Invert(S(i-1)))
        String sLeft = "", sRight = "";
        int i=0;
        while (sRight.length()<k){
            i++;
            sRight = sLeft+(char)(i+'a'-1)+reverse(inverse(sLeft));
            sLeft = sRight;
        }
        return sLeft.charAt(k-1);
    }

    //对每一个字符a变z   b变y
    private String inverse(String sLeft) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sLeft.length(); i++) {
            char c = (char)('z'-sLeft.charAt(i)+'a');
            sb.append(c);
        }
        return sb.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Main02 m = new Main02();
        char ans = m.findKthBit(4,11);
        System.out.println(ans);
    }

}
