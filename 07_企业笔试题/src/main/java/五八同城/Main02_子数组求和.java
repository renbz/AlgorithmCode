package 五八同城;

/**
 * @author Ren
 */

public class Main02_子数组求和 {

    public static void main(String[] args) {
        Main02_子数组求和 obj = new Main02_子数组求和();
        int[] ints = obj.subArraySum(new int[]{1, 2, 30, 4, 5, 6, 7, 8, 9, 10}, 10, 3);
        System.out.println(ints[0]+"  "+ints[1]);
    }
    public int[] subArraySum (int[] Array, int arrayLen, int subArrayLen) {
        // write code here

        int [] sum = new int[arrayLen+1];
        for (int i = 0; i < arrayLen; i++) {
            sum[i+1]=sum[i]+Array[i];
        }
        int max = Integer.MIN_VALUE , index = -1;
        for (int i = subArrayLen; i < sum.length; i++) {
            if(max<sum[i]-sum[i-subArrayLen]){
                max = sum[i]-sum[i-subArrayLen];
                index = i-subArrayLen;
            }
        }
        return new int[]{index,max};
    }

}
