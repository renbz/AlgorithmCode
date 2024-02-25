package LeetCode周赛.第376场;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2023/12/17 10:37
 * @Description:
 */

public class R100161_划分数组并满足最大差限制 {
    public static void main(String[] args) {
        divideArray(new int[]{1,3,4,8,7,9,3,5,1}, 2);
    }

    public static int[][] divideArray(int[] nums, int k) {


        Arrays.sort(nums);
        if (nums.length < 3 || nums[nums.length - 1] - nums[0] > k) {
            return new int[][]{};
        }
        List<int[]> result = new ArrayList<>();
        Deque<Integer> stack = new LinkedList<>();
        int start = 0;
        int end = 0;
        while (start < nums.length) {

            while (end < nums.length && nums[end] - nums[start] <= k) {
                if(end-start==3){
                    addAns(start, end, result);
                }
                end++;
            }

            start++;
        }
        System.out.println(result);
        return result.toArray(new int[result.size()][]);
    }

    private static void addAns(int start, int end, List<int[]> result) {
       result.add(new int[]{nums[start]})
    }

}
