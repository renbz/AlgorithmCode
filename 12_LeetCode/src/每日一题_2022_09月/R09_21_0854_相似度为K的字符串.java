//package 每日一题_2022_09月;
//
//import javafx.util.Pair;
//
//import java.util.ArrayDeque;
//import java.util.HashSet;
//import java.util.Queue;
//import java.util.Set;
//
///**
// * @author Ren - 乔治的哥们
// * @Date: 2022/9/21 20:57
// * @Description:
// */
//
//public class R09_21_0854_相似度为K的字符串 {
//
//    public int kSimilarity(String s1, String s2) {
//        int n = s1.length();
//        Queue<Pair<String, Integer>> queue = new ArrayDeque<Pair<String, Integer>>();
//        Set<String> visit = new HashSet<String>();
//        queue.offer(new Pair<String, Integer>(s1, 0));
//        visit.add(s1);
//        int step = 0;
//        while (!queue.isEmpty()) {
//            int sz = queue.size();
//            for (int i = 0; i < sz; i++) {
//                Pair<String, Integer> pair = queue.poll();
//                String cur = pair.getKey();
//                int pos = pair.getValue();
//                if (cur.equals(s2)) {
//                    return step;
//                }
//                while (pos < n && cur.charAt(pos) == s2.charAt(pos)) {
//                    pos++;
//                }
//                for (int j = pos + 1; j < n; j++) {
//                    if (s2.charAt(j) == cur.charAt(j)) {
//                        continue;
//                    }
//                    if (s2.charAt(pos) == cur.charAt(j)) {
//                        String next = swap(cur, pos, j);
//                        if (!visit.contains(next)) {
//                            visit.add(next);
//                            queue.offer(new Pair<String, Integer>(next, pos + 1));
//                        }
//                    }
//                }
//            }
//            step++;
//        }
//        return step;
//    }
//
//    public String swap(String cur, int i, int j) {
//        char[] arr = cur.toCharArray();
//        char c = arr[i];
//        arr[i] = arr[j];
//        arr[j] = c;
//        return new String(arr);
//    }
//
//}
