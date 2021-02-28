package Programmers_level2;

import java.util.Stack;

public class level2_올바른괄호 {

    public static void main(String[] args) {
        String s = "(()(";
        boolean answer = solution(s);
        System.out.println(answer);
    }

    private static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                stack.add('(');
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

}
