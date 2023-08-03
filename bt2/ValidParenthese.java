package bt2;

import java.util.Stack;

public class ValidParenthese {
    public static void main(String[] args) {
        System.out.println(isVaild("()[]{}"));
    }

    public static boolean isVaild(String s){
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{' ){
                stack.push(c);
            }else if(stack.isEmpty() || ( c == ')' && stack.pop() != '(') || ( c == ']' && stack.pop() != '[') || (c=='}' && stack.pop()!='{')){
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}
