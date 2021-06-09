package ch02;

/**
 * @author Ren
 */

public class T03_2_不修改数组找出重复的数字 {

    public static void main(String[] args) {
        int [] arr = {2,3,5,4,3,2,6,7};
        int ans = getDuplication(arr,arr.length);
        System.out.println(ans);
    }

    static int getDuplication(int [] arr, int length){
        if(arr==null || length <= 0){
            return -1;
        }
        // 找到数组中的最大值和最小值
        int min=length,max = 1;
        for (int i = 0; i < length; i++) {
            min=min>arr[i]?arr[i]:min;
            max=max<arr[i]?arr[i]:max;
        }
        int start = min;
        int end = max;
        while (end >= start){
            int middle = ((end-start)>>1) + start;
            int count = countRange(arr,length,start,middle);
            // 当start==end 则找到重复的目标，返回数据
            if(end==start){
                if(count>1){
                    return start;
                }else{
                    break;
                }
            }
            // 若 count>(middle-start+1) 该区间（数字大小区间 不是数组的区间）内有重复元素 下次循环的end=middle
            if(count>(middle-start+1)){
                end = middle;
            }else{ // 否则 对后半个区间进行统计  start = middle+1
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 统计区间元素在数组中出现的次数的方法
     */
    static int countRange(int [] arr,int length,int start,int end){
        if(arr==null){
            return 0;
        }
        int counts = 0;
        for (int i = 0; i < length; i++) {
            if(arr[i]>=start && arr[i]<=end){
                counts++;
            }
        }
        return counts;
    }
}
