package algorithm;

/**
 * Created by lnq on 2017/5/9.
 */

/**
 * 快排 + 分治思想
 */
public class Fastalgorithm {
    void fastSort(int a[],int l,int r){
        int i = 1;
        int j = r;
        int X = a[i];    //a[1]为基准
        while(i < j){
            while(i < j && a[j] >= X) j--;
            if(i < j){
                a[i] = a[j];
                i++;
            }
            while(i < j && a[i] < X) i++;
            if(i < j){
                a[j] = a[i];
                j--;
            }
            a[i] = X;
            fastSort(a,1,i-1);    //分治
            fastSort(a,i+1,r);
        }
    }
}
