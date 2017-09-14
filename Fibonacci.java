package algorithm;

/**
 * Created by Linnq on 2017/8/1.
 */
public class Fibonacci {
    int k = 3;
    int m;

    public int fibonacci(int n) {
        m = n;
        if (1 == n) {
            return 0;
        } else if (2 == n) {
            return 1;
        }
        return fibonacci(0, 1);
        // write your code here
    }

    public int fibonacci(int i, int j) {
        if (k == m) {
            return i + j;
        }
        k++;
        return fibonacci(j, i + j);
    }

    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(10));
    }
}
