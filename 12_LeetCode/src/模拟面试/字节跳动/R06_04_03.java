package 模拟面试.字节跳动;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren
 */

public class R06_04_03 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, Integer> map = new HashMap<>(numCourses);
        Set<String> set = new HashSet<>();

        for (int i = 0; i < prerequisites.length; i++) {

            if(map.get(prerequisites[i][0])!=null) return false;
            map.put(prerequisites[i][0],prerequisites[i][1]);
        }

        int count = 0;
        for (int i = 0; i < prerequisites.length; i++) {

            int key = prerequisites[i][0];
            while(map.get(key)!=null){
                key = map.get(key);
                count++;
                if(count > prerequisites.length*2) return false;
            }
        }
        return true;

    }

}
