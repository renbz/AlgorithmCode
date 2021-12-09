package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/9 10:54
 * @Description:
 */

public class R12_09_0794_有效的井字游戏 {

    public static void main(String[] args) {
        System.out.println(validTicTacToe(new String[]{"XOX", "O O", "XOX"}));
    }

    public static boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') xCount++;
                if (board[i].charAt(j) == 'O') oCount++;
            }
        }
        // X的数量大于等于O的数量
        if (xCount < oCount) return false;
        // X的数量最多比O多一个
        if(xCount-oCount>1) return false;
        // X和O 不能同时存在三个相连的情况
        boolean xConn = false, oConn = false;
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2) && board[i].charAt(1) == 'X') {
                xConn = true;
            }
            if (board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2) && board[i].charAt(1) == 'O') {
                oConn = true;
            }
            if(board[0].charAt(i)==board[1].charAt(i) && board[1].charAt(i)==board[2].charAt(i) && board[0].charAt(i)=='X'){
                xConn = true;
            }
            if(board[0].charAt(i)==board[1].charAt(i) && board[1].charAt(i)==board[2].charAt(i) && board[0].charAt(i)=='O'){
                oConn = true;
            }
        }
        if(board[0].charAt(0)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(2) && board[0].charAt(0)=='X'){
            xConn =true;
        }
        if(board[0].charAt(0)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(2) && board[0].charAt(0)=='O'){
            oConn =true;
        }
        if(board[0].charAt(2)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(0) && board[1].charAt(1)=='X'){
            xConn =true;
        }
        if(board[0].charAt(2)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(0) && board[1].charAt(1)=='O'){
            oConn =true;
        }
        if(xConn && oConn) return false;
        // 如果xConn为true，那么X的数量一定大于O的数量
        if(xConn && xCount<=oCount) return false;
        // 如果oConn为true，那么X的数量一定等于O的数量
        if(oConn && xCount!=oCount) return false;

        return true;
    }
}
