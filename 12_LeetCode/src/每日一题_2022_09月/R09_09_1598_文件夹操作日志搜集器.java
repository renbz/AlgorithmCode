package 每日一题_2022_09月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/9 22:03
 * @Description:
 */

public class R09_09_1598_文件夹操作日志搜集器 {

    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("./".equals(log)) {
                continue;
            } else if ("../".equals(log)) {
                if (depth > 0) {
                    depth--;
                }
            } else {
                depth++;
            }
        }
        return depth;
    }

}
