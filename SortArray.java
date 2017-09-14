package algorithm;

import java.util.Arrays;

/**
 * Created by lnq on 2017/5/15.
 */
public class SortArray {
    public void sortIntegers(int[] A) {
        // Write your code here
        if(A.length > 0){
            sort(A,0,A.length-1);
        }
        System.out.println(Arrays.toString(A));
    }
    private void sort(int[] A , int l, int r){
        int i = l,j = r, x = A[l];
        while(i < j){
            while(i < j && x < A[j]) j--;
            if(i < j){
                A[i] = A[j];
                i++;
            }
            while(i < j && x > A[i]) i++;
            if(i < j){
                A[j] = A[i];
                j--;
            }
        }
        A[i] = x;
        if(i > l) sort(A,0,i-1);
        if(i < r) sort(A,i+1,r);
    }
    public static void main(String args[]){
        int[] A = {7,22,58,54,13,42,52,-3,35,-1,88,32,64,54,13,78,22,10,73,82,58,20,45,25,0,13,28,9,84,40,-5,41,1,6,90,84,88,59,13,22,31,0,-9,62,37,86,68,11,71,55,60,86,73,73,-4,69,55,24,3,59,80,9,71,-4,33,59,15,-1,59,-4,56,90,-8,59,48,80,-6,47,42,69,34,46,9,58,7,15,5,66,20,26};
        SortArray s = new SortArray();
        s.sortIntegers(A);
    }
}
