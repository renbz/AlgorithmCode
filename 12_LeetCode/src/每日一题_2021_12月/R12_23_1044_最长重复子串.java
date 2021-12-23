package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/23 09:28
 * @Description:
 */

public class R12_23_1044_最长重复子串 {

    /**
     * 主要思想：
     * 设字符串为S(1-n)由n个字符组成。则字符串有n个相同后缀的子串。分别为s(1-n),s(2-n),…,s(n,n)。
     * 然后构建一个SA数组，每个数组存储这些后缀的子串，存储后进行字典序排序。
     * 最后构造出一个height数组，表示SA数组每个元素和前一个元素相同前缀的字符个数。
     * 那么，最长重复子串的长度就是height数组的最大值。
     * 因为最长重复子串一定是两个不同后缀的公共前缀，而且这两个不同后缀的字典序排列后一定是相连的。否则一定有比他更长的。
     * 所以height的最大值能够找到那两个后缀，然后提取公共前缀就找到答案。
     *
     * sa 数组：字典序排名为 ii 的后缀是第几个；
     * rk 数组：第 ii 个后缀的排名是多少（不难发现 rk 与 sa 满足 sa[rk[i]] = rk[sa[i]] = isa[rk[i]]=rk[sa[i]]=i）；
     * height 数组：存储 sa[i]sa[i] 与 sa[i - 1]sa[i−1] 的 LCP（最长公共前缀） 为何值。
     *
     * @param s
     * @return
     */
    int N = 30010;
    int[] x = new int[N], y = new int[N], c = new int[N];
    int[] sa = new int[N], rk = new int[N], height = new int[N];
    void swap(int[] a, int[] b) {
        int n = a.length;
        int[] c = a.clone();
        for (int i = 0; i < n; i++) a[i] = b[i];
        for (int i = 0; i < n; i++) b[i] = c[i];
    }
    public String longestDupSubstring(String s) {
        int n = s.length(), m = 128;
        s = " " + s;
        char[] cs = s.toCharArray();
        // sa：两遍基数排序，板子背不下来也可以直接使用 sort，复杂度退化到 n \log^2 n
        for (int i = 1; i <= n; i++) {
            x[i] = cs[i]; c[x[i]]++;
        }
        for (int i = 2; i <= m; i++) c[i] += c[i - 1];
        for (int i = n; i > 0; i--) sa[c[x[i]]--] = i;
        for (int k = 1; k <= n; k <<= 1) {
            int cur = 0;
            for (int i = n - k + 1; i <= n; i++) y[++cur] = i;
            for (int i = 1; i <= n; i ++) {
                if (sa[i] > k) y[++cur] = sa[i] - k;
            }
            for (int i = 1; i <= m; i++) c[i] = 0;
            for (int i = 1; i <= n; i++) c[x[i]]++;
            for (int i = 2; i <= m; i++) c[i] += c[i - 1];
            for (int i = n; i > 0; i--) {
                sa[c[x[y[i]]]--] = y[i];
                y[i] = 0;
            }
            swap(x, y);
            x[sa[1]] = cur = 1;
            for (int i = 2; i <= n; i++) {
                if (y[sa[i]] == y[sa[i - 1]] && y[sa[i] + k] == y[sa[i - 1] + k]) x[sa[i]] = cur;
                else x[sa[i]] = ++cur;
            }
            if (cur == n) break;
            m = cur;
        }
        // height
        int k = 0;
        for (int i = 1; i <= n; i ++) rk[sa[i]] = i;
        for (int i = 1; i <= n; i++) {
            if (rk[i] == 1) continue;
            int j = sa[rk[i] - 1];
            k = k > 0 ? k - 1 : k;
            while (i + k <= n && j + k <= n && cs[i + k] == cs[j + k]) k++;
            height[rk[i]] = k;
        }
        int idx = -1, max = 0;
        for (int i = 1; i <= n; i++) {
            if (height[i] > max) {
                max = height[i];
                idx = sa[i];
            }
        }
        return max == 0 ? "" : s.substring(idx, idx + max);
    }

}
