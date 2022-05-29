import java.io.File;
import java.util.ArrayList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/29 11:03
 * @Description:
 */

public class FileBean {

    ArrayList<ExpStrBean> filter;

    public FileBean(ArrayList<ExpStrBean> filter) {
        this.filter = filter;
    }

    public ArrayList<ExpStrBean> getFilter() {
        return filter;
    }

    public void setFilter(ArrayList<ExpStrBean> filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "FileBean{" +
                "filter=" + filter +
                '}';
    }



}
class ExpStrBean {

    String exp;
    String str;

    public ExpStrBean(String exp, String str) {
        this.exp = exp;
        this.str = str;
    }

    public ExpStrBean() {
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "ExpStrBean{" +
                "exp='" + exp + '\'' +
                ", str='" + str + '\'' +
                '}';
    }
}

