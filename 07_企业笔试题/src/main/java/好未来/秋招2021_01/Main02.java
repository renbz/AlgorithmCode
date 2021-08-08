package 好未来.秋招2021_01;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren
 */
import java.util.*;

public class Main02 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        List<List<Integer>> list = threeSum(arr);
        for (int i = 0; i < list.size(); i++) {
            List<Integer> ans = list.get(i);
            for (int i1 = 0; i1 < ans.size(); i1++) {
                System.out.print(ans.get(i1) + " ");
            }
            System.out.println();
        }


    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return ans;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);

                    while (l < r && nums[l] == nums[l + 1]) l = l + 1;
                    while (l < r && nums[r] == nums[r - 1]) r = r - 1;
                    l = l + 1;
                    r = r - 1;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r = r - 1;
                } else {
                    l = l + 1;
                }
            }
        }
        return ans;
    }
}
