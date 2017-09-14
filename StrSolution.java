package algorithm;

/**
 * Created by lnq on 2017/6/1.
 */

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * 单词的构成：无空格字母构成一个单词
 *输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 *如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 */
public class StrSolution {
    public String reverseWords(String s) {
        // write your code

//        char[] c = s.trim().toCharArray();
//        for(int i = 1,j=1;i < c.length;i++){
//            if(c[i-1] == ' ' && c[i] == ' '){
//                c[i] = c[i+1];
//            }
//        }
//        return  null;

        String str = "";
        String[] strs = s.trim().split("\\b");
        for(int i = strs.length - 1; i > 0 ; --i){
            if(!strs[i].contains(" ")){
                str += strs[i] + " " ;
            }
        }
        return  str += strs[0];
    }
    public static void main(String args[]){
        StrSolution ss = new StrSolution();
        String s = "lnq and    dyy";
        s = ss.reverseWords(s);
        System.out.println(s);
    }
}
