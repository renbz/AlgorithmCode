package math2021;

import java.util.*;

/**
 * @author Ren
 */

public class Main05 {
    static char[] arr = {'1','2','3','4'};
    static int count;
    static Set<String> set = new HashSet();
    static Set<String> setres = new HashSet();
    static List<String> list;
    public static void main(String[] args) {
        m();


        //输出setres集合
        for (String str : setres) {
            System.out.println(str.charAt(0)+"\t"+str.charAt(1)+"\t"+str.charAt(2)+"\t"+str.charAt(3)+"\t");
            System.out.println(str.charAt(4)+"\t"+str.charAt(5)+"\t"+str.charAt(6)+"\t"+str.charAt(7)+"\t");
            System.out.println(str.charAt(8)+"\t"+str.charAt(9)+"\t"+str.charAt(10)+"\t"+str.charAt(11)+"\t");
            System.out.println(str.charAt(12)+"\t"+str.charAt(13)+"\t"+str.charAt(14)+"\t"+str.charAt(15)+"\t");
            System.out.println("-------------------------------");
        }
        System.out.println("共 "+setres.size()+" 种");

    }


    public static void m(){
        f(0);

        //集合中存放的是每个小格的排列
        // 为方便遍历将集合元素存入List中
        list = new ArrayList();

        for(String s : set){
            list.add(s);
        }


        for (int i = 0; i < list.size()-3; i++) {
            for (int j = i+1; j < list.size()-2; j++) {
                for (int k = i+2; k < list.size()-1; k++) {
                    for (int l = i+3; l < list.size(); l++) {
                        tmp(i,j,k,l);tmp(i,j,l,k);tmp(i,k,j,l);tmp(i,k,l,j);tmp(i,l,k,j);tmp(i,l,j,k);
                        tmp(j,i,k,l);tmp(j,i,l,k);tmp(j,k,i,l);tmp(i,k,l,i);tmp(j,l,k,i);tmp(j,l,i,k);
                        tmp(k,j,i,l);tmp(k,j,l,i);tmp(k,i,j,l);tmp(k,i,l,j);tmp(k,l,i,j);tmp(k,l,j,i);
                        tmp(l,j,k,i);tmp(l,j,i,k);tmp(l,k,j,i);tmp(l,k,i,j);tmp(l,i,k,j);tmp(l,i,j,k);

                    }
                }
            }
        }
    }

    public static void tmp(int i,int j,int k,int l){
        //得到4个小型区域的排列，组合称一个大的排列
        boolean b = isOK(list.get(i),list.get(j),list.get(k),list.get(l));
        if(b){
            //找到一个符合条件的数独，输出它！！！！
            count++;
            setres.add(list.get(i)+list.get(j)+list.get(k)+list.get(l));
        }
    }


    /**
     * 获取全排列的方法
     * @param k
     */
    public static void f(int k){
        if(k==arr.length){
            // 将全排列结果存入集合中，达到去重效果
            StringBuilder builder = new StringBuilder();
            builder.append(arr[0]).append(arr[1]).append(arr[2]).append(arr[3]);
            set.add(builder.toString());
        }else{
            for (int i = k; i < arr.length; i++) {
                char t = arr[i];arr[i]=arr[k];arr[k]=t;
                f(k+1);
                t = arr[i];arr[i]=arr[k];arr[k]=t;
            }
        }
    }


    /**
     * 将行和列传入common方法是否相等
     * @param s1
     * @param s2
     * @param s3
     * @param s4
     * @return
     */
    public static boolean isOK(String s1,String s2,String s3,String s4){
        boolean b1 = isCommon(s1.charAt(0),s1.charAt(1),s2.charAt(0),s2.charAt(1));
        boolean b2 = isCommon(s1.charAt(2),s1.charAt(3),s2.charAt(2),s2.charAt(3));
        boolean b3 = isCommon(s3.charAt(0),s3.charAt(1),s4.charAt(0),s4.charAt(1));
        boolean b4 = isCommon(s3.charAt(2),s3.charAt(3),s4.charAt(2),s4.charAt(3));

        boolean b5 = isCommon(s1.charAt(0),s1.charAt(2),s3.charAt(0),s3.charAt(2));
        boolean b6 = isCommon(s1.charAt(1),s1.charAt(3),s3.charAt(1),s3.charAt(3));
        boolean b7 = isCommon(s2.charAt(0),s2.charAt(2),s4.charAt(0),s4.charAt(2));
        boolean b8 = isCommon(s2.charAt(1),s2.charAt(3),s4.charAt(1),s4.charAt(3));

        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8;
    }

    /**
     * 判断传入的四个数  列或行 是否有重复元素
     * @param r1
     * @param r2
     * @param r3
     * @param r4
     * @return
     */
    public static boolean isCommon(char r1,char r2,char r3,char r4){
        Set<Character> set1 = new HashSet();
        set1.add(r1);
        set1.add(r2);
        set1.add(r3);
        set1.add(r4);


        return set1.size()==4 ;
    }

}
