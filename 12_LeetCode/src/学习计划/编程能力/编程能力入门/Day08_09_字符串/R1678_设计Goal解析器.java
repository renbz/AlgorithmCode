package 学习计划.编程能力.编程能力入门.Day08_09_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 18:27
 * @Description:
 */

public class R1678_设计Goal解析器 {

    public String interpret(String command) {
        command = command.replaceAll("\\(al\\)", "al");
        command = command.replaceAll("\\(\\)", "o");
        return command;
    }

}
