package java_2013_A;

/**
 * @author Ren
 */

public class Main004_颠倒的价牌2 {
    public static void main(String[] args) {
        for(int i=1001;i<9999;i++){
            String s1 = String.valueOf(i);
            if(s1.contains("3") || s1.contains("4") || s1.contains("7"))
                continue;
            for(int j=1001;j<9999;j++){
                String s2 = String.valueOf(j);
                if(s2.contains("3") || s2.contains("4") || s2.contains("7"))
                    continue;

                int fi = Integer.parseInt(t(s1));

                int fj = Integer.parseInt(t(s2));
                int k = fi - i;//亏损
                int y = fj-j;//盈利

                if(k<-200 && k>-300 && y >800 && y <900 && y+k == 558){
                    System.out.println(i);
                    return;
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
