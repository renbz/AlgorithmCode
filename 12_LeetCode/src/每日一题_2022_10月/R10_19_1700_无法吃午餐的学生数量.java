package 每日一题_2022_10月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/19 22:32
 * @Description:
 */

public class R10_19_1700_无法吃午餐的学生数量 {

    public int countStudents(int[] students, int[] sandwiches) {
        int s1 = Arrays.stream(students).sum();
        int s0 = students.length - s1;
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0 && s0 > 0) {
                s0--;
            } else if (sandwiches[i] == 1 && s1 > 0) {
                s1--;
            } else {
                break;
            }
        }
        return s0 + s1;
    }
}