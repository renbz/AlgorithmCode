package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/17 23:40
 * @Description:
 */

public class 剑指OfferII_085_生成匹配的括号 {

    List<String> ans = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        if (n <= 0) return ans;
        dfs(new StringBuilder(),0,0);
        return ans;
    }

    void dfs(StringBuilder path, int open, int close) {
        if (path.length() == 2 * n) {
            ans.add(path.toString());
            return;
        }
        if (open < n){
            dfs(path.append("("), open + 1, close);
            path.delete(path.length()-1,path.length());
        }

        if (close < open){
            dfs(path.append(")"), open, close + 1);
            path.delete(path.length()-1,path.length());
        }
    }

}
