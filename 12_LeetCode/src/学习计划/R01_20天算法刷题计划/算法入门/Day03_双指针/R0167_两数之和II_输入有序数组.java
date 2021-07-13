package 学习计划.R01_20天算法刷题计划.算法入门.Day03_双指针;

/**
 * @author Ren
 */

public class R0167_两数之和II_输入有序数组 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int sum = 0;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if(sum==target) return new int[]{left+1,right+1};
            if(sum>target) right--;
            if(sum<target) left++;
        }
        return new int[]{left+1,right+1};
    }

}
