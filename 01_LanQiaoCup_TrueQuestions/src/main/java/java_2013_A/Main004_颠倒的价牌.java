package java_2013_A;

/**
 * @author Ren
 */

public class Main004_颠倒的价牌 {
    public static void main(String[] args) {
        char[]c = {'1','2','5','6','8','9','0'};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 7; k++) {
                    for (int l = 0; l < 7; l++) {
                        String s1 = ""+c[i]+c[j]+c[k]+c[l];
                        String f1 = t(s1);
                        for (int m = 0; m < 6; m++) {
                            for (int n = 0; n < 7; n++) {
                                for (int o = 0; o < 7; o++) {
                                    for (int p = 0; p < 7; p++) {
                                        String s2 = ""+c[m]+c[n]+c[o]+c[p];
                                        String f2 = t(s2);
                                        int ss1 = Integer.parseInt(s1);
                                        int ff1 = Integer.parseInt(f1);
                                        int ss2 = Integer.parseInt(s2);
                                        int ff2 = Integer.parseInt(f2);
                                        int kui = ff1-ss1;
                                        int zhuan = ff2-ss2;
                                        if(kui> -300 && kui< -200 && zhuan>800 && zhuan<900
                                            && zhuan+kui==558 ){
                                            System.out.println(s1);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //放反价格牌
    static String t(String s){
        String ans = "";
        for (int i = 3; i >= 0; i--) {
            if(s.charAt(i)=='1')  ans+="1";
            if(s.charAt(i)=='2')  ans+="2";
            if(s.charAt(i)=='5')  ans+="5";
            if(s.charAt(i)=='6')  ans+="9";
            if(s.charAt(i)=='8')  ans+="8";
            if(s.charAt(i)=='9')  ans+="6";
            if(s.charAt(i)=='0')  ans+="0";
        }
        return ans;
    }
}
