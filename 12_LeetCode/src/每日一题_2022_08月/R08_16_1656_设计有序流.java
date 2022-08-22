package 每日一题_2022_08月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:51
 * @Description:
 */

public class R08_16_1656_设计有序流 {

    class OrderedStream {
        private String[] stream;
        private int ptr;

        public OrderedStream(int n) {
            stream = new String[n + 1];
            ptr = 1;
        }

        public List<String> insert(int idKey, String value) {
            stream[idKey] = value;
            List<String> res = new ArrayList<String>();
            while (ptr < stream.length && stream[ptr] != null) {
                res.add(stream[ptr]);
                ++ptr;
            }
            return res;
        }
    }

}
