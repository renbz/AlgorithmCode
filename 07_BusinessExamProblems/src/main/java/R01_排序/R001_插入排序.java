package R01_排序;

/**
 * @author Ren
 */

public class R001_插入排序 {

    public static void main(String[] args) {

    }

    public static void InsertSort(int[] array){
        int i,j,tmp;
        for (i = 0; i < array.length; i++) {
            // 将array[i] 保存在临时变量tmp中
            tmp=array[i];
            j = i-1;
            while(j>=0 && tmp<array[i]){
                // 循环找到array[i] 应该放的位置
                array[j+1] = array[j--];
            }
            // 将元素tmp 插入指定位置
            array[j+1] = tmp;
        }
    }
}
