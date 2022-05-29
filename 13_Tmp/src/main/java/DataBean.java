import java.util.ArrayList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/29 12:23
 * @Description:
 */

public class DataBean {

    String str;
    ArrayList<String> call;

    public DataBean(String str, ArrayList<String> call) {
        this.str = str;
        this.call = call;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ArrayList<String> getCall() {
        return call;
    }

    public void setCall(ArrayList<String> call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "str='" + str + '\'' +
                ", call=" + call +
                '}';
    }
}
