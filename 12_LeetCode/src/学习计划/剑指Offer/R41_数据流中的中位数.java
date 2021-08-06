package 学习计划.剑指Offer;

import java.util.PriorityQueue;

/**
 * @author Ren
 */

public class R41_数据流中的中位数 {

    /**
     * 如果元素总个数为奇数个，这里设置minHeap多保留一个
     * <p>
     * 小顶堆保留较大的一半数据  弹出的是较大的一半中最小的那个元素
     * 大顶堆保留较小的一半数据  弹出的是较小的一半中最大的那个元素
     * <p>
     * 由于 num 可能属于 “较小的一半” （即属于 maxHeap ），因此不能将nums 直接插入至 minHeap 。
     * 而应先将 num 插入至 maxHeap ，再将 maxHeap 堆顶元素插入至 minHeap 。
     * 这样就可以始终保持 minHeap 保存较大一半、 maxHeap 保存较小一半。
     */


    PriorityQueue<Integer> minHeap, maxHeap;

    public void MedianFinder() {
        minHeap = new PriorityQueue<>();  // 小顶堆
        maxHeap = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆
    }

    public void addNum(int num) {
        if (minHeap.size() != maxHeap.size()) {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        } else {  //当两堆中的元素相等时，小根堆多保留一个
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
    }

    public double findMedian() {
        return minHeap.size() == maxHeap.size() ? (minHeap.peek() + maxHeap.peek()) / 2.0 : minHeap.peek();
    }

}
