package ACM_模板;

/**
 * @author Ren
 */

public class R01_KMP {

    public static void main(String[] args) {

    }

    /**
     *
     * @param pattern  要比较的目标串
     * @param prefix   前缀和后缀相同的表
     * @param n        整个表的长度n
     */
    void prefix_table(char pattern[],int prefix[],int n){
        pattern[0]=0;  //前缀表的第一位设置为0
        int len = 0;   // 初始子串长度
        int i = 1; //检测第i个字母,i从第二个字母开始比较  下标为1
        while (i<n){
            /**
             * 当第i个字母和第len个相等时
             */
            if(pattern[i]==pattern[len]){
                len++;
                prefix[i] = len;
                i++;
            }else{
                /**
                 * 当第i个字母和第len个不相等时
                 */
                if(len>0)
                    len = prefix[len-1];
            }
        }
    }
}
