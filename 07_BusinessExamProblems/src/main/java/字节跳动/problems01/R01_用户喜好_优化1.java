package 字节跳动.problems01;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class R01_用户喜好_优化1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 用户数
        int userCount = in.nextInt();
        // 用户编号
        int tmp = 0;
        /*
         * 为优化算法，查出所有的喜好值k，对应的用户
         * 查询时根据喜好值 查询用户数量
         * 将喜好值 和 用户编号(下标) 以键值对的形式存入hashmap集合中
         */
        ArrayList<Integer> list;
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(userCount);
        for (int i = 0; i < userCount; i++) {
            tmp = in.nextInt();

            if (map.get(tmp) == null) {
                list = new ArrayList<Integer>();
            } else {
                list = map.get(tmp);
            }
            list.add(i + 1);
            map.put(tmp, list);

        }


        // 查询组数
        int k = in.nextInt();
        while (k-- > 0) {
            int l = in.nextInt();
            int i = in.nextInt();
            int r = in.nextInt();

            if(map.get(r)==null){
                System.out.println(0);
                continue;
            }

            list = map.get(r);
            int ans = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= l && list.get(j) <= i) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}


/*
* 为了不断优化推荐效果，今日头条每天要存储和处理海量数据。
* 假设有这样一种场景：我们对用户按照它们的注册时间先后来标号，对于一类文章
* ，每个用户都有不同的喜好值，我们会想知道某一段时间内注册的用户（标号相连的一批用户）中，
* 有多少用户对这类文章喜好值为k。因为一些特殊的原因，不会出现一个查询的用户区间完全覆盖另一个查询的用户区间(不存在L1<=L2<=R2<=R1)。



        输入描述:
        输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度
        * 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，
        * 即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。 数据范围n <= 300000,q<=300000 k是整型

        输出描述:
        输出：一共q行，每行一个整数代表喜好值为k的用户的个数

        输入例子1:
        5
        1 2 3 3 5
        3
        1 2 1
        2 4 5
        3 5 3

        输出例子1:
        1
        0
        2
* */