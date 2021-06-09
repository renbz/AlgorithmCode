package 剑指Offer;

/**
 * @author Ren
 */

public class R20_表示数值的字符串 {

    public boolean isNumber(String s) {
        s = s.toLowerCase();
        s = s.trim();
        if(s.contains(" ")) return false;
        if(!s.matches(".*[0-9].*")) return false;
        if (s.length() == 0 || s == null) return false;

        // e或E后面不能有小数，即不能有., 且必须有数字
        int index_e=Integer.MAX_VALUE;
        int index_e2=Integer.MAX_VALUE;
        if (s.contains("e")) {
            index_e = s.indexOf('e');
            index_e2 = s.lastIndexOf('e');
            if (!s.substring(0,index_e).matches(".*[0-9].*")) return false;
        }
        int index_d = s.lastIndexOf('.');
        if (index_d > index_e || index_e == s.length() - 1 || index_e == 0) return false;

        // 不能包含除e、E外的其他字母
        if (s.matches(".*[a-df-z]")) return false;

        // 不能两个符号相连，+-100
        if (s.contains("+-") || s.contains("++") || s.contains("--") || s.contains("-+")) return false;

        // 只能包含一个.
        int index_d2 = s.indexOf('.');

        if (index_d != index_d2 || index_e!= index_e2) return false;

        return true;


    }

    public boolean isNumber2(String s) {
        return s.trim().matches("^[+-]?(\\d+|\\d+\\.\\d*|\\.\\d+)([eE][+-]?\\d+)?$");
    }



}
