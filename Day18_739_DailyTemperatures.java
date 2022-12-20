package leetcodeDec2022;

import java.util.Stack;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 18
 * Problem 739: Daily Temperatures
 *
 */


class Day18_739_DailyTemperatures {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int result [] = new int [n];

        Stack <int []> stack = new Stack<>();
        stack.push(new int[]{temperatures[n-1], n-1});

        for (int i=n-2; i>=0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= stack.peek()[0])
                stack.pop();
            if (!stack.isEmpty())
                result[i] = stack.peek()[1] - i;
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}