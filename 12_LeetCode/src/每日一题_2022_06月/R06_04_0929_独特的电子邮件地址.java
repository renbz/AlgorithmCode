package 每日一题_2022_06月;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/4 23:27
 * @Description:
 */

public class R06_04_0929_独特的电子邮件地址 {

    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0,i).split("\\+")[0];
            local = local.replace(".","");
            emailSet.add(local+email.substring(i));
        }
        return emailSet.size();
    }

}
