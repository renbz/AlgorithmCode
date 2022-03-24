package 学习计划.编程能力.编程能力入门.Day01_基本数据类型;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/23 19:48
 * @Description:
 */

public class R1491_去掉最低工资和最高工资后的工资平均值 {

    public double average(int[] salary) {
        double sum = 0;
        int max = salary[0], min = salary[0];
        for (int num : salary) {
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return (sum - max - min) / (salary.length - 2);
    }

}
