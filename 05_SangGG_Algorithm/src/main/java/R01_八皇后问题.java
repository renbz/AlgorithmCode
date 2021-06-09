/**
 * @author Ren
 */

/**
 * 理论上应该创建一个二维数组 来表示期盼，但是实际上可以通过算法，用一个一位数组即可解决问题
 *  arr[8] = { 0,4,7,5,2,6,1,3 }
 *  // 对应arr下标表示第几行，即第几个皇后，arr[i]=val 表示第i+1个皇后 放在第i+1行的第val+1列。
 */

public class R01_八皇后问题 {

    // 定义一个max表述有多少个皇后
    int max = 8;
    // 定义数组array,保存皇后放置的位置，比如arr = { 0,4,7,5,2,6,1,3 }
    int [] array = new int[max];
    public static void main(String[] args) {
        R01_八皇后问题 r01_八皇后问题 = new R01_八皇后问题();
        r01_八皇后问题.check(0);
    }


    /**
     * 编写一个方法，放置第N个皇后
     * 特别注意： check 是每一次递归时，进入到check()中 都有  for (int i = 0; i < max; i++)
     * @param n
     */
    private void check(int n){
        if(n == max){ // n=8 , 其实8个皇后 就已经放好了
            print();
            return;
        }
        // 依次放入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            //先把当前的这个皇后  放到该行的第一列
            array[n] = i;
            // 判断当前位置第n个皇后到第i列时，是否冲突
            if(judge(n)){ // 不冲突
                //接着放第n+1个元素，即开始递归
                check(n+1);   //包含了回溯算法

            }
            //如果冲突，就继续执行 array[n]=i; 即将第n个皇后，放置在本行的 后一个位置
        }
    }


    // 查看当我们放置第n个皇后时就去检测该皇后是否和前面已经摆放的皇后冲突
    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            /**
             * 说明
             * 1. array[i] == array[n]  表示判断 第n个皇后是否和前面的n-1个皇后在同一列
             * 2. Math.abs(n-i)==Math.abs(array[n] - array[i]) 表示判断 第n个皇后是否和第i个皇后在同一斜线
             * 3. 判断是否在同一行  没有必要，n每次都在递增
             */
            if(array[i] == array[n] || Math.abs(n-i)==Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;

    }

    //写一个方法 将皇后摆放的位置输出
    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

}
