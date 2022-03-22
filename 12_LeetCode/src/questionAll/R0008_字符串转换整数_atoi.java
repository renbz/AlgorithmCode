package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/22 10:48
 * @Description:
 */

public class R0008_字符串转换整数_atoi {

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        //1.去空格
        int index = 0;
        while (index < len && chars[index] == ' ')
            index++;
        //2.排除极端情况 "    "
        if (index == len) return 0;
        //3.设置符号
        int sign = 1;
        char firstChar = chars[index];
        if (firstChar == '-') {
            index++;
            sign = -1;
        } else if (firstChar == '+') {
            index++;
        }
        int res = 0, last = 0; //last 记录上一次的res，以此来判断是否溢出
        while (index < len) {
            char c = chars[index];
            if (c < '0' || c > '9') break;
            int tem = c - '0';
            last = res;
            res = res * 10 + tem;
            if (last != res / 10)  ////如果不相等就是溢出了
                return (sign == (-1)) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            index++;
        }
        return res * sign;
    }

}
