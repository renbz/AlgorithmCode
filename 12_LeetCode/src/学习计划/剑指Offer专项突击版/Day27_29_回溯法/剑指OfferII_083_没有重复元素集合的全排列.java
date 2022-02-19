package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/17 22:58
 * @Description:
 */

public class 剑指OfferII_083_没有重复元素集合的全排列 {

    List<List<Integer>> ans = new ArrayList<>();
    int[]arr;
    int len;
    public List<List<Integer>> permute(int[] nums) {
        arr=nums;
        len = nums.length;
        f(0);
        return ans;
    }
    void f(int k){
        if(k==len){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) list.add(arr[i]);
            ans.add(list);
        }
        for (int i = k; i < len; i++) {
            int t = arr[k]; arr[k] = arr[i]; arr[i] = t;
            f(k+1);
            t = arr[k]; arr[k] = arr[i]; arr[i] = t;
        }
    }


}
