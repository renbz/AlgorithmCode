package ch02;

/**
 * @author Ren
 */

public class T05_替换空格 {

    public static void main(String[] args) {
        char [] ch = "We are happy".toCharArray();
        char [] newChar = replaceStr(ch);
        for (int i = 0; i < newChar.length; i++) {
            System.out.print(newChar[i]);
        }
    }
    // 将空格替换为指定字符串的方法
    static char[] replaceStr(char[] ch){
        //遍历数组 查看有多少个空格
        int counts = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==' '){
                counts++;
            }
        }
        char [] newCh = new char[ch.length+counts*2];
        int index = ch.length-1;
        int newIndex = newCh.length-1;
        while(index>=0 && newIndex>=0){
            if(ch[index]!=' '){
                newCh[newIndex--] = ch[index--];
            }else{
                newCh[newIndex--]='%';
                newCh[newIndex--]='0';
                newCh[newIndex--]='2';
                index--;
            }
        }
        return newCh;
    }
}