package algorithm;

/**
 * Created by Linnq on 2017/9/6.
 */

/**
 * 最长公共子序列问题：
 * 动态规划处理
 */
public class LCS {
    public static void main(String[] args) {
        String str1 = "fjssharpsword";
        String str2 = "helloworld";
        int[][] resultRe = longestCommonSubsequence(str1, str2);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                System.out.print(resultRe[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        print(resultRe, str1, str2, str1.length(), str2.length());
        System.out.println();
    }

    //填充数据 ， 获取矩阵
    public static int[][] longestCommonSubsequence(String str1, String str2) {
        int[][] chess = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            chess[i][0] = 0;
        }
        for (int j = 0; j <= str2.length(); j++) {
            chess[0][j] = 0;
        }
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    chess[i][j] = chess[i - 1][j - 1] + 1;
                } else {
                    chess[i][j] = chess[i - 1][j] > chess[i][j - 1] ? chess[i - 1][j] : chess[i][j - 1];
                }
            }
        }
        return chess;
    }

    //输出lck
    public static void print(int[][] opt, String X, String Y, int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (X.charAt(i - 1) == Y.charAt(j - 1)) {
            print(opt, X, Y, i - 1, j - 1);
            System.out.print(X.charAt(i - 1));
        } else if (opt[i - 1][j] >= opt[i][j]) {
            print(opt, X, Y, i - 1, j);
        } else {
            print(opt, X, Y, i, j - 1);
        }
    }

    }

