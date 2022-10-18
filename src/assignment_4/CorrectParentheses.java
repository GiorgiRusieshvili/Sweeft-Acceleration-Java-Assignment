package assignment_4;

import java.util.Stack;

public class CorrectParentheses {
    public static void main(String[] args) {

        String sequence = "(())";
        System.out.println(isProperly(sequence));

    }

    //method checks if parentheses are correctly closed and returns a boolean value
    static boolean isProperly(String sequence) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;

            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }


        }
        return stack.isEmpty();
    }
}

