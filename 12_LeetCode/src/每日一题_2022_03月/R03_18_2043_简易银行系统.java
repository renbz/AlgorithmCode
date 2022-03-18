package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/18 11:46
 * @Description:
 */

public class R03_18_2043_简易银行系统 {

    class Bank {

        long[] balance;
        int n;

        public Bank(long[] balance) {
            this.balance = balance;
            this.n = balance.length;
        }

        public boolean transfer(int account1, int account2, long money) {
            // 1向2转账money
            if (checkAccount(new int[]{account1, account2}) && balance[account1 - 1] >= money) {
                balance[account1 - 1] -= money;
                balance[account2 - 1] += money;
                return true;
            }
            return false;
        }

        public boolean deposit(int account, long money) {
            // 存款
            if (checkAccount(new int[]{account})) {
                balance[account - 1] += money;
                return true;
            }
            return false;
        }

        public boolean withdraw(int account, long money) {
            // 取款
            if (checkAccount(new int[]{account}) && balance[account - 1] >= money) {
                balance[account - 1] -= money;
                return true;
            }
            return false;
        }


        boolean checkAccount(int[] accounts) {
            for (int account : accounts) {
                if (account < 1 || account > n) return false;
            }
            return true;
        }
    }

}
