package 每日一题_2022_01月;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/5 22:00
 * @Description:
 */

public class R01_06_0071_简化路径 {

    public String simplifyPath(String path) {
        path = path.replaceAll("//", "/");
        String[] pathArr = path.split("/");
        Deque<String> deque = new LinkedList();
        for (String pathA : pathArr) {
            if (pathA.equals(".") || pathA.equals("")) {
                continue;
            } else if (pathA.equals("..")) {
                if (!deque.isEmpty()) deque.pollLast();
            } else {
                deque.add(pathA);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!deque.isEmpty()) {
            ans.append("/").append(deque.pollFirst());
        }
        return ans.toString().length() > 0 ? ans.toString() : "/";
    }
}
