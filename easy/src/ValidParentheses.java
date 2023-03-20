import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            String current = String.valueOf(s.charAt(i));
            if(stack.isEmpty()){
                stack.push(current);
                continue;
            }
            if(current.equals(")")&&stack.peek().equals("(")){
                stack.pop();
                continue;
            }
            if(current.equals("]")&&stack.peek().equals("[")){
                stack.pop();
                continue;
            }
            if(current.equals("}")&&stack.peek().equals("{")){
                stack.pop();
                continue;
            }
            stack.push(current);
        }
        return stack.isEmpty();
    }
}
