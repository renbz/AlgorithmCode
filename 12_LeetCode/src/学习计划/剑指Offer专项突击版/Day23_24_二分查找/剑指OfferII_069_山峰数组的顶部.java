package 学习计划.剑指Offer专项突击版.Day23_24_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/11 19:54
 * @Description:
 */

public class 剑指OfferII_069_山峰数组的顶部 {

    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] < arr[mid - 1]) r = mid;
            else l = mid;
        }
        return -1;
    }

}
