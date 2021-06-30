import java.util.*;

/**
 * @author Ren
 */

public class Test implements Cloneable {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> hashmap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();


        System.out.println(Integer.MAX_VALUE);
        System.out.println((3 ^ 15) == 12);

        new Thread(() -> {
            System.out.println("ABCDEF");
        }, Thread.currentThread().getName()).start();

    }

    public void test() throws Exception {
        if (5 < 0) {
            throw new Exception("xxx异常");
        }
    }
}
