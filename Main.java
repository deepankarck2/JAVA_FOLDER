import java.util.Stack;

public class Main {
    
    public static void main(String[] args){


    }

    public static boolean isValid(String s) {
        
        if (s.length() == 0) return true;
        if(s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size() == 0) return false;
                if(s.charAt(i) == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                    else return false;
                }
                else if(s.charAt(i) == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }
                    else return false;
                }
                else if(s.charAt(i) == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }
                    else return false;
                }
            }

        }

        return stack.size() == 0;

    }

}
