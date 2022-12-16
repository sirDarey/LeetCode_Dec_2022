package leetcodeDec2022;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 16
 * Problem 232: Implement Queue using Stacks 
 *
 */


class Day16_232_ImplementQueueUsingStacks {
    
    class MyQueue {
        Queue <Integer> queue;

        public MyQueue() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.offer(x);
        }

        public int pop() {
            return(queue.poll());
        }

        public int peek() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}