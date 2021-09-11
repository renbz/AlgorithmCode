package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_01_0165_比较版本号 {

    public static void main(String[] args) {
        int i = compareVersion("0.1", "1.1");
        System.out.println(i);
    }

    public static int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = v1.length>v2.length?v1.length:v2.length;
        int [] num1 = new int[len];
        int [] num2 = new int[len];
        for (int i = 0; i < v1.length; i++) {
            num1[i] = Integer.valueOf(v1[i]);
        }
        for (int i = 0; i < v2.length; i++) {
            num2[i] = Integer.valueOf(v2[i]);
        }

        for (int i = 0; i < len; i++) {
            if(num1[i]==num2[i]) continue;
            if(num1[i]>num2[i]){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }
}
