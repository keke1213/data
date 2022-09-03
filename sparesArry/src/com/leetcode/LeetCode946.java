package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode946 {
    public static void main(String[] args) {
        validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1});
    }

    /**
     * pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
     * 输出：true
     * 解释：我们可以按以下顺序执行：
     * push(1), push(2), push(3), push(4), pop() -> 4,
     * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
     */
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
