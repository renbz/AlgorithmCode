package R04_算法思维系列;

/**
 * @author Ren
 */

import java.util.*;

/**
 * 输出一个数组子集
 */
public class R01_回溯_子集 {

    public static void main(String[] args) {
        Vector nums = new Vector<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        subsets(nums);

        /**
         * 打印res
         */
        for (int i = 0; i < res.size(); i++) {
            System.out.println(Arrays.toString(res.get(i).toArray()));
        }
    }

    /**
     * 回溯算法解题   决策树
     */
    static Vector<Vector<Integer>> res = new Vector<Vector<Integer>>();
    static Vector<Vector<Integer>> subsets(Vector<Integer> nums){
        // 记录走过的路径
        Vector<Integer> track = new Vector<Integer>();
        backTrack(nums,0,track);
        return res;
    }

    /***
     * 回溯算法模板
     */
    static void backTrack(Vector<Integer> nums,int start,Vector<Integer> track){
        // 前序遍历的位置
        res.add(track);
        // 从start开始，防止参数重复的子集
        for (int i = start; i < nums.size(); i++) {
            // 做选择
            track.add(nums.get(i));
            // 递归回溯
            backTrack(nums,i+1,track);
            // 撤销选择
            track.removeElementAt(track.size()-1);
        }
    }

}
