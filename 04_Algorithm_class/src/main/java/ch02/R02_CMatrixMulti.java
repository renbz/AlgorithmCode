package ch02;

/**
 * @author Ren
 */

public class R02_CMatrixMulti {

    public static void main(String[] args) {
        int[][] arrayA = {
                {1,7,5,1,5},
                {4,0,6,9,6},
                {6,9,9,7,2},
                {2,7,3,4,5},
                {7,5,1,3,7},};
        int[][] arrayB = {
                {6,7,8,9,10},
                {2,3,4,5,6},
                {9,2,7,4,3},
                {8,7,3,6,5},
                {9,5,3,7,8},};
        int [][] arrayC = new int[5][5];
        CMatrixMulti(arrayA,arrayB,arrayC);

        //遍历输出数组C
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC.length; j++) {
                System.out.print(arrayC[i][j]+"\t");
            }
            System.out.println();
        }

    }

    /**
     * 方阵相乘
     * @param arrayA  方阵A
     * @param arrayB  方阵B
     * @param arrayC  A、B相乘后的方阵C
     */
    public static void CMatrixMulti(int[][] arrayA , int [][] arrayB , int[][] arrayC){

        int n = arrayA.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayC[i][j]=0; // 初始化方阵C
                for (int k = 0; k < n; k++) {
                    arrayC[i][j] += arrayA[i][k]*arrayB[k][j];
                }
            }
        }

    }
}
