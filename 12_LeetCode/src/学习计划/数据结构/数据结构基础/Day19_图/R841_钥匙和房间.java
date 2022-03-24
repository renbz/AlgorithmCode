package 学习计划.数据结构.数据结构基础.Day19_图;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren
 */

public class R841_钥匙和房间 {
    List<List<Integer>> rooms = null;
    // 已经去过的房间
    Set<Integer> alreadySet = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.rooms = rooms;
        f(0);
        return alreadySet.size() == rooms.size();
    }

    void f(int roomNum) {
        alreadySet.add(roomNum);
        List<Integer> list = rooms.get(roomNum);
        for (int i = 0; i < list.size(); i++) {
            int newRoomNum = list.get(i);
            if (!alreadySet.contains(newRoomNum)) f(newRoomNum);
        }
    }
}
