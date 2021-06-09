package ch03;

/**
 * @author Ren
 */

public class R04_String {

    public static void main(String[] args) {

        String str1 = "njcakhbskncudowefsamcidihjsdgfh";
        String str2 = "dowe";
        int res = BruteforceIndex(str1,str2);
        System.out.println("文本字符串: "+str1);
        System.out.println("目标字符串: "+str2);
        System.out.println("目标字符串首字母在文本中的下标为： "+res);
    }


    static int BruteforceIndex(String word , String target){
        char [] wordArr = word.toCharArray();
        char [] targetArr = target.toCharArray();

        int n = wordArr.length;
        int m = targetArr.length;

        for (int i = 0; i < n-m; i++) {
            int j=0;
            while(j<m && wordArr[i+j]==targetArr[j]){
                j++;
                if(j==m)
                    return i;
            }
        }
        return -1;
    }
}
