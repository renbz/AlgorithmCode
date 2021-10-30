package 小米集团; /**
 * @author Ren
 */

import java.util.*;

public class Main01_扑克洗牌 {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = new String[]{"♥", "♦", "♣", "♠"};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        //组合
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                list.add(color[j] + arr1[i]);
            }
        }
        list.add("大王");
        list.add("小王");
        ArrayList<String> list2 = new ArrayList<>(list);

// -------------------------------- 自定义洗牌策略 -----------------------------
        //将数据放入list中
        while (list.size() > 0) {
            int index = (int) (Math.random() * list.size());
            // getEle 为随机选出的一张牌，定义三个集合只需将牌依次发给三个人即可(除了地主牌)。
            String getEle = list.get(index);
            newList.add(getEle);  //newList 为洗牌后的序列
            // 移除已经取得的牌
            list.remove(index);
        }
        fapai(newList, "方法一", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());


        // 以下部分为后期补充

//------------------------方法2 使用Collections里的shuffle方法----------------------


        // -- 洗牌   使用Collections里的shuffle方法，传递牌的索引集合
        Collections.shuffle(list2);
        fapai(list2, "方法二", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

    }

// --------------------------------------------------------------------------------------

    /**
     *  发牌
     * @param list   所有集合
     * @param name   第几种方法
     * @param play01  玩家一
     * @param play02  玩家二
     * @param play03  玩家三
     * @param dipai   底牌
     */
    public static void fapai(ArrayList<String> list, String name,
                             ArrayList<String> play01, ArrayList<String> play02, ArrayList<String> play03, ArrayList<String> dipai) {
        // -- 发牌    定义四个集合，底牌+3玩家
        // 遍历存储牌的list集合，获取每一个牌的索引
        for (int i = 0; i < list.size(); i++) {
            // 获取每一张牌
            String in1 = list.get(i);
            // 轮流发牌
            if (i >= 51) {
                dipai.add(in1);
            } else if (i % 3 == 0) { // 给玩家1发牌
                play01.add(in1);
            } else if (i % 3 == 1) { // 给玩家2发牌
                play02.add(in1);
            } else if (i % 3 == 2) { // 给玩家3发牌
                play03.add(in1);
            }
        }
        // 输出
        System.out.println("------------"+name+"---------------");
        print("play01" + name, play01);
        print("play02" + name, play02);
        print("play03" + name, play03);
        print("dipai" + name, dipai);
        System.out.println();
    }


    /**
     * 输出牌
     * @param name  名称
     * @param list  集合
     */
    public static void print(String name, List list) {

        System.out.print(name + "   ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();
    }
}