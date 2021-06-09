package ch06;

/**
 * @author Ren
 */

public class R02_LCS {

    public static void main(String[] args) {
        String str1 = "ABCDKASB";
        String str2 = "ACKMABY";
        System.out.println("输入的字符串为: \n"+str1+"\n"+str2);
        dp(str1,str2);
    }

    public static void dp(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dpTable = new int[len1 + 1][len2 + 1];
        int[][] b = new int[len1][len2];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    //b[i-1][j-1] = 1;
                    dpTable[i][j] = 1 + dpTable[i - 1][j - 1];
                } else {
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
                }
            }
        }

        System.out.print("\nLCS长度为: "+dpTable[len1][len2]);

    }
}