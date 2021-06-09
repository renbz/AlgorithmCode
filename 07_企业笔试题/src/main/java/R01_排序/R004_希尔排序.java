package R01_排序;

/**
 * @author Ren
 * 希尔排序 又称 缩小增量排序
 * 一种比较常用而且效果比较好的发方法是： 首先间隔取序列长度的一半；
 * 在后续的排序过程中，后一趟排序的间隔为前一趟排序间隔的一半
 */

public class R004_希尔排序 {

    public static void main(String[] args) {
        shellSort(new int[]{1,2,5,4,3});
    }

    public static void shellSort(int array[]) {
        int gap = array.length;
        boolean flag ;
        while (gap > 1) {
            // 按照经验值 每次缩小间隔一半
            gap = gap / 2;
            // 子序列可以使用冒泡排序
            do {
                flag = false;
                for (int i = 0; i < array.length - gap; i++) {
                    int j = i + gap;
                    if(array[i]>array[j]){
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        flag = true;
                    }
                }
            }while (flag);

        }

        //打印排序完成的数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }

}
