package algorithm;

/**
 * Created by lnq on 2017/5/11.
 */
public class largestNumber {

    public String largestNumber(int[] num) {
        String a = "";
        sort(num,0,num.length-1);
        if(num[0] == 0){
            return "0";
        }
        for( int i = 0;i < num.length; i++){
            a += num[i];
        }
        return a;
    }

    private void sort(int[] num,int l,int r) {
        // write your code here
        int  i = l, j = r;
        int X = num[i];
        if(i < j){
            while(i < j){
                while(i < j && compare(X,num[j])) j--;
                if(i < j){
                    num[i] = num[j];
                    i++;
                }
                while(i < j && compare(num[i],X)) i++;
                if(i < j){
                    num[j] = num[i];
                    j--;
                }
            }
            num[i] = X;
            if(i > l) sort(num,0,i-1);
            if(j < r) sort(num,i+1,r);
        }
    }
    private boolean compare(int a ,int b){
        return ("" + a + b).compareTo(("" + b + a)) >= 0 ? true : false;
    }
    public static void main(String args[]){
        largestNumber l = new largestNumber();
        int[] s = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(l.largestNumber(s));
    }
}
