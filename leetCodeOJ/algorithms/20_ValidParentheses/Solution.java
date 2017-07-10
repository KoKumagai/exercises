import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char curBracket : s.toCharArray()) {

            switch(curBracket) {

                case '(' :
                    stack.push(')');
                    break;
                case '{' :
                    stack.push('}');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                default :
                    if (stack.isEmpty() || curBracket != stack.pop()) {
                        return false;
                    }

            }

        }

        return stack.isEmpty();

    }

}
