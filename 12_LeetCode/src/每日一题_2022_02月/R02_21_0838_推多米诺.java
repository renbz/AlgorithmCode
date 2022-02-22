package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/21 13:04
 * @Description:
 */

public class R02_21_0838_推多米诺 {

    public String pushDominoes(String dominoes) {
        String s = null;
        while (true) {
            s = dominoes;
            dominoes = dominoes.replace("R.L", "R*L").replace("R.", "RR").replace(".L", "LL");
            if (s.equals(dominoes)) break;
        }
        return dominoes.replace("*", ".");
    }

}
