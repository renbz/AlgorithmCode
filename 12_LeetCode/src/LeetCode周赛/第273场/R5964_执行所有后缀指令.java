package LeetCode周赛.第273场;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/26 10:39
 * @Description:
 */

public class R5964_执行所有后缀指令 {
    public static void main(String[] args) {
        R5964_执行所有后缀指令 obj = new R5964_执行所有后缀指令();
        obj.executeInstructions(3,new int[]{0,1},"RDDLU");
    }

    int n;
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        this.n = n;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = count(new int[]{startPos[0],startPos[1]}, s.substring(i));
        }
        return ans;
    }

    // 判断走了几步越界
    public int count(int[] startPos, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check(startPos, s.charAt(i))) {
                count++;
                if (s.charAt(i) == 'L') startPos[1] -= 1;
                if (s.charAt(i) == 'R') startPos[1] += 1;
                if (s.charAt(i) == 'U') startPos[0] -= 1;
                if (s.charAt(i) == 'D') startPos[0] += 1;
            }else{
                return count;
            }
        }
        return count;
    }

    //判断是否出界
    public boolean check(int[] startPos, char c) {
        if (c == 'L' && startPos[1] - 1 >= 0) return true;
        if (c == 'U' && startPos[0] - 1 >= 0) return true;
        if (c == 'R' && startPos[1] + 1 < n) return true;
        if (c == 'D' && startPos[0] + 1 < n) return true;
        return false;
    }
}
