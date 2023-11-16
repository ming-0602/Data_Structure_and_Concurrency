package Lab3;

import java.util.Stack;

public class StackandQueue {

    public static boolean isBalance(String expression){

        Stack<Character> chr = new Stack<>();
        boolean balance = true;
        int index = 0;

        while (balance && index < expression.toCharArray().length){
            Character ch = expression.charAt(index);
            if (isOpen(ch)){
                chr.push(ch);
            } else if (isClose(ch) ) {
                if (chr.empty()){
                    balance = false;
                }else {
                    Character topchar = chr.pop();
                    if (!areMatching(topchar, ch)){
                        balance = false;
                    }
                }
            }
            index++;
        }

        if (balance && chr.empty()){
            return true;
        }else {
            return false;
        }
    }


    private static boolean isOpen(char ch){

        if (ch == '(' || ch == '{' || ch == '[' || ch == '<'){
            return true;
        }
        return false;
    }

    private static boolean isClose(char ch){
        if (ch == ')' || ch == '}' || ch == ']' || ch == '>' ){
            return true;
        }
        return false;
    }

    private static boolean areMatching(char c1, char c2){
        if ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') ||(c1 == '[' && c2 == ']') || (c1 == '<' && c2 == '>')){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalance("{[]}"));
        System.out.println(isBalance("sdad"));
        System.out.println(isBalance("(([]}]"));
    }

}
