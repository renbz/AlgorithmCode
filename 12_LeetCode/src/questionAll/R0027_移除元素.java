package questionAll;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/21 09:58
 * @Description:
 */

public class R0027_移除元素 {

    static int[] a = new int[]{2, 2, 3};

    public static void main(String[] args) {
        R0027_移除元素 obj = new R0027_移除元素();
        int ans = obj.removeElement(a, 2);
        System.out.println(Arrays.toString(a) + "      " + ans);
    }

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length;
        if (nums.length == 1 && nums[0] == val) return 0;
        while (l < r) {
            if (nums[l] == val) {
                nums[l] = nums[r - 1];
                r--;
            } else {
                l++;
            }
        }
        return l;
    }

}
