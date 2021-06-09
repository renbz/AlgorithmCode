package ch02;

/**
 * @author Ren
 */

public class T03_1_找出数组中重复的数字 {

    public static void main(String[] args) {
        // 定义一个数组
        int [] arr = {2,3,1,0,2,5,3};
        // 调用判断方法
        duplicate(arr,arr.length);

    }

    /**
     * 代码中尽管有一个双循环，但每个数字最多只要减缓两次就能找到属于它自己的位置
     * 因此总的时间复杂度为 O(n) , 空间复杂度为 O(1)
     * @param nums
     * @param length
     * @return
     */
    public static boolean duplicate(int nums[], int length){

        //先判断数组是否为空、
        if(nums==null || length<=0){
            return false;
        }

        //遍历数组,如果存在元素 小于0 或 大于数组索引 的情况则不符合题意
        for (int i = 0; i < length; i++) {
            if(nums[i] <0 || nums[i]>=length) {
                return false;
            }
        }

        //其他情况 即：符合题意的情况
        for (int i = 0; i < length; i++) {
            while (nums[i] != i){
                // 如果当前元素 不等于当前索引，并且： 目标索引等于目标索引上的元素，则发现相等元素
                if(nums[i]==nums[nums[i]]){
                    System.out.println(nums[i]);
                    return true;
                }
                //当前元素 不等于当前索引，并且： 目标索引不等于目标索引上的元素
                int temp = nums[i]; nums[i] = nums[nums[i]]; nums[temp]=temp;
            }

        }
        return false;
    }

}
