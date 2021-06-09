package ch04;



/**
 * @author Ren
 */


public class R05_BigInteger_2 {
    public static void main(String[] args){

        String ans = "";
        String t  = "1";
        for (int i = 1; i <= 100; i++) {
           t = multiply(i+"",t);
        }
        System.out.println(t);
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String multiply(String num1, String num2){
        int[] ret=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            int x=num1.charAt(i)-'0';
            for(int j=num2.length()-1;j>=0;j--){
                int y=num2.charAt(j)-'0';
                ret[i+j]+=(ret[i+j+1]+x*y)/10;
                ret[i+j+1]=(ret[i+j+1]+x*y)%10;

            }
        }
        String s="";
        for(int i=0;i<ret.length;i++){
            if(i==0&&ret[i]==0) continue;
            s+=ret[i];
        }
        return s;
    }
}
