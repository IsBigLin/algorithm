package algorithm;

import java.util.Stack;

/**
 * Created by Linnq on 2017/9/5.
 */
//计算后缀表达式（逆波兰表达式）
// 当遇到一个数时就把它压入栈中；在遇到一个操作符时，该操作符就作用于从该栈弹出的两个数上，再将所得结果压入栈中
public class ReversePolishNotation {
    public static String reversePolish(String str) {
        String[] splitStr = str.split(" ");
        Stack<String> stack = new Stack<String>();
        String a;
        String b;
        for (int i = 0; i < splitStr.length; i++) {
            if (!("+".equals(splitStr[i]) || "-".equals(splitStr[i])
                    || "*".equals(splitStr[i]) || "/".equals(splitStr[i]))) {
                stack.push(splitStr[i]);
            } else {
                a = stack.peek();
                stack.pop();
                b = stack.peek();
                stack.pop();
                if("+".equals(splitStr[i])){
                    stack.push(Double.parseDouble(a) + Double.parseDouble(b) + "");
                }else if("-".equals(splitStr[i])){
                    stack.push(Double.parseDouble(a) - Double.parseDouble(b) + "");
                }else if("*".equals(splitStr[i])){
                    stack.push(Double.parseDouble(a) * Double.parseDouble(b) + "");
                }else if("/".equals(splitStr[i])){
                    stack.push(Double.parseDouble(a) / Double.parseDouble(b) + "");
                }
            }
        }
        return stack.pop();
    }
    public static void main(String args[]){
        String c = reversePolish("2 1 + 3 * ");
        System.out.println(c);

        //还需对表达式 正确性 进行判断。
    }
}
