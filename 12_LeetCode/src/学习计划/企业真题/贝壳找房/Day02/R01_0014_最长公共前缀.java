package 学习计划.企业真题.贝壳找房.Day02;

/**
 * @author Ren
 */

public class R01_0014_最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {
        int l = 0;
        int r=0;
        k:
        while (true){
            char c = ' ';
            if(strs[0].length()>r) c= strs[0].charAt(r);
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].length()==r  || c!=strs[i].charAt(r)){
                    break k;
                }
            }
            r++;
        }
        return strs[0].substring(l,r);
    }
}
