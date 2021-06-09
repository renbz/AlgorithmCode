package ch01;

import java.util.Stack;

/**
 * @author Ren
 */

public class Test02_Binary {
    public static void main(String[] args) {

        System.out.println(toBinary(100)); // 方法一
        toBinary2(100);  // 方法二
    }

    /**
     * 方法一： 调用java自带函数
     */
    public static String toBinary(long n){
        return Long.toBinaryString(n);
    }

    /**
     *方法二： 除二取余 倒序排列
     */
    public static void toBinary2(long n){
        Stack stack = new Stack();
        while(n>0){
            long t = n%2;
            n=n/2;
            stack.add(t);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }

}
