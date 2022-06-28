package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/28 14:46
 * @Description:
 */

public class R06_21_1108_IP地址无效化 {

    public String defangIPaddr(String address) {
        return address.replaceAll(".","\\[.\\]");
    }

}
