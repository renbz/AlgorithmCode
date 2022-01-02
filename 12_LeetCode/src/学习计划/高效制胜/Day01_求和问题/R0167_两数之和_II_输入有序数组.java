package 学习计划.高效制胜.Day01_求和问题;

/**
 * @author Ren
 */
import java.util.concurrent.*;
public class R0167_两数之和_II_输入有序数组 {

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
