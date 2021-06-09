package 剑指Offer;

/**
 * @author Ren
 */

public class R11_旋转数组的最小数字 {

    public int minArray(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            min = min>numbers[i]?numbers[i]:min;
        }
        return min;
    }

}
