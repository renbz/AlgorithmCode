package questionAll;

/**
 * @author Ren
 */

public class R1736_替换隐藏数字得到最晚时间 {

    public String maximumTime(String time) {


        String str = "";
        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?') {
                str += "23";
            } else if ((int) (time.charAt(1)) < ((int) '4')) {
                str += "2";
                str += time.charAt(1);
            } else {
                str += "1";
                str += time.charAt(1);
            }
        } else if (time.charAt(0) == '0' || time.charAt(0) == '1') {
            if (time.charAt(1) == '?') {
                str += time.charAt(0);
                str += "9";
            } else {
                str += time.charAt(0);
                str += time.charAt(1);
            }
        } else {
            if (time.charAt(1) == '?') {
                str += "23";
            } else {
                str += "2";
                str += time.charAt(1);
            }
        }

        str += ":";

        if (time.charAt(3) == '?') {
            if (time.charAt(4) == '?') {
                str += "59";
            } else {
                str += "5";
                str += time.charAt(4);
            }
        } else {
            if (time.charAt(4) == '?') {
                str += time.charAt(3);
                str += "9";
            } else {
                str += time.charAt(3);
                str += time.charAt(4);
            }
        }
        return str;

    }

}
