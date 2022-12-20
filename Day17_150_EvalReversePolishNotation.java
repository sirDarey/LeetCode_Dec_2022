package leetcodeDec2022;

import java.util.Stack;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 17
 * Problem 150: Evaluate Reverse Polish Notation
 *
 */


class Day17_150_EvalReversePolishNotation {
    
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        
        for (String i : tokens) {
            int a,  b;
            switch (i) {
                case "*" : stack.push(stack.pop() * stack.pop()); break;
                case "+" : stack.push(stack.pop() + stack.pop()); break;
                case "-" : 
                    b = stack.pop(); a = stack.pop();
                    stack.push(a - b);
                    break;
                case "/" : 
                    b = stack.pop(); a = stack.pop();
                    stack.push(a / b);
                    break;
                default: stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}