package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/27 10:28
 * @Description:
 */

public class R01_27_2047_句子中的有效单词数 {

    public static void main(String[] args) {
        System.out.println("cat and  dog".trim().split("[ ]+").length);
    }
    public int countValidWords(String sentence) {
        String[] ss = sentence.trim().split("[ ]+");
        int ans = 0;
        for (String s : ss) {
            if (s.matches("^[a-z]+(-[a-z]+)*[,.!]?$")) ans++;
            else if(s.length()==1 && s.matches("[!,.]")) ans++;
        }
        return ans;
    }

}
