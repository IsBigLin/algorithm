package algorithm;

/**
 * Created by hspcadmin on 2017/5/17.
 */
public class Solution {
    private static volatile Solution SOLUTION = null;
    private Solution(){}
    public static Solution getInstance() {
        if(SOLUTION == null){
            synchronized (Solution.class){
                if(SOLUTION == null){
                    SOLUTION = new Solution();
                }
            }
        }
        // write your code here
        return  SOLUTION;
    }
}
