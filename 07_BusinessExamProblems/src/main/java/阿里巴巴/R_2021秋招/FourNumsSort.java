package 阿里巴巴.R_2021秋招;

/**
 * @author Ren
 */

public class FourNumsSort {

    public static void main(String[] args) {


        int a = 5, b = 7, c = 9, d = 2;

        if(a>=b && a>=c && a>=d){
            if(b>=c && b>=d){
                if(c>d) System.out.println(a +" "+b+" "+c+" "+d);
                else System.out.println(a +" "+b+" "+d+" "+c);
            }
            if(c>=b && c>=d) {
                if (b > d) System.out.println(a + " " + c + " " + b + " " + d);
                else System.out.println(a + " " + c + " " + d + " " + b);
            }
        }

        if(a>=b && a>=c && a>=d){
            if(b>=c && b>=d){
                if(c>d) System.out.println(a +" "+b+" "+c+" "+d);
                else System.out.println(a +" "+b+" "+d+" "+c);
            }
            if(c>=b && c>=d) {
                if (b > d) System.out.println(a + " " + c + " " + b + " " + d);
                else System.out.println(a + " " + c + " " + d + " " + b);
            }
        }
    }

}
