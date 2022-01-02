package LeetCode周赛.第274场;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 10:32
 * @Description:
 */

public class R5967_检查是否所有A都在B之前 {

    public boolean checkString(String s) {
        int aind = s.lastIndexOf('a');
        int bind = s.indexOf('b');
        if (bind == -1 || aind == -1) return true;
        return aind < bind;
    }

}
