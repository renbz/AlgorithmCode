package R01_排序;

/**
 * @author Ren
 */

public class R005_堆排序 {

    public static void main(String[] args) {

    }


    public static void heapSort(int[] array){
        int i,tmp;
        for (i = array.length/2; i >= 1; i--) {
            adjust(array,i,array.length);
        }

        // 交换第一个和第n个元素，再将根节点向下调整
        for (i = array.length-1; i >= 0 ; i--) {
            tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            adjust(array,1,i);  //将根节点向下调整
        }
    }

    /**
     * 将一个普通序列 调整成一个堆序列
     * @param k  待调整的数组
     * @param i  第i个元素为根节点的子树 调整成一个大根堆
     * @param n  数组长度
     */
    private static void adjust(int[]k,int i,int n){
        int j=2*i,tmp=k[i-1];
        while (j<=n){
            if(j<n && k[j-1]<k[j]){
                j++;              // j为左右孩子中较大孩子的序号
            }
            if(tmp>k[j-1]){
                break;            // tmp为最大元素不需要交换
            }else{
                k[j/2-1] = k[j-1];    // 交换元素位置
                j = 2*i;
            }
        }
        k[j/2-1] = tmp;            // 将k中第i个元素放到调整后的最终位置上
    }
}