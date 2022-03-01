package 每日一题_2022_03月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/1 18:44
 * @Description:
 */

public class R03_01_0006_Z字形变换 {

    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}
