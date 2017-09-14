package algorithm;

/**
 * Created by Linnq on 2017/9/12.
 */
public class Permutation {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        permutation(str,0,str.length-1);
    }

    private static void permutation(String[] str, int from, int to) {
        if (to <= 0) {
            return;
        } else if (from == to) {
            for(int i = 0;i <= to ; i++){
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            for (int i = from; i <= to; i++) {
                swap(str, i, from);
                permutation(str, from + 1, to);
                swap(str,from + 1,to);
            }
        }
    }

    private static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    ;
}
