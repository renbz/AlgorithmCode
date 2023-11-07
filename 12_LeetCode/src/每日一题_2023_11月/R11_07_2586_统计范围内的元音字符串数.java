package 每日一题_2023_11月;
/**
* @author Ren - 乔治的哥们
* @Date: 2023/11/7 19:23
* @Description: 
*/

public class R11_07_2586_统计范围内的元音字符串数 {

    String yy = "aeiou";
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for(int i = left; i <=right ; i++) {
            if(yy.indexOf(words[i].charAt(0))!=-1 && yy.indexOf(words[i].charAt(words[i].length()-1))!=-1){
                ans++;
            }
        }
        return ans;
    }
    
}
