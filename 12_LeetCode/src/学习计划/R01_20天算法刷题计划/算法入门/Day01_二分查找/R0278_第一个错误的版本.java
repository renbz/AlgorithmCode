package 学习计划.R01_20天算法刷题计划.算法入门.Day01_二分查找;

/**
 * @author Ren
 */

public class R0278_第一个错误的版本 {

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {

            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }


    public boolean isBadVersion(int version) {
        return true;
    }

}
