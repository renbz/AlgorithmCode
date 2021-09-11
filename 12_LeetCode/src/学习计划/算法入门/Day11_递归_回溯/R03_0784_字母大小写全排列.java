package 学习计划.算法入门.Day11_递归_回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R03_0784_字母大小写全排列 {

    List<String> ans = new ArrayList<>();
    String s;
    int len;
    public List<String> letterCasePermutation(String s) {
        this.s = s;
        len = s.length();
        dfs(0,new StringBuilder());
        return ans;
    }
    void dfs(int curIndex,StringBuilder builder){
        if(curIndex==len){
            ans.add(builder.toString());
            return;
        }

        char c = s.charAt(curIndex);
        if(Character.isDigit(c)){
            builder.append(c);
            dfs(curIndex+1,builder);
        }else{
            StringBuilder builder1 = new StringBuilder(builder);
            StringBuilder builder2 = new StringBuilder(builder);
            builder1.append(Character.toLowerCase(c));
            builder2.append(Character.toUpperCase(c));
            dfs(curIndex+1,builder1);
            dfs(curIndex+1,builder2);
        }
    }
}
