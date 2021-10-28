package compareTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ren
 */

public class Test {

    public static void main(String[] args) {

        List<Reason> list = new ArrayList<>();
        list.add(new Reason(7,"77777777777777777"));
        list.add(new Reason(2,"22222222222222222"));
        list.add(new Reason(2,"222222222222-----"));
        list.add(new Reason(1,"111111111111111111"));
        list.add(new Reason(5,"555555555555555555"));

        Collections.sort(list,(o1, o2) -> {return o1.getPriority()-o2.getPriority();});

        System.out.println(list);

    }

}
