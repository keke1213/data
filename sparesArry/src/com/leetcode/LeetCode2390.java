package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LeetCode2390 {
    public static void main(String[] args) {
        removeStars("leet**cod*e");
    }

    /**
     * 输入：s = "leet**cod*e"
     * 输出："lecoe"
     * 解释：从左到右执行移除操作：
     * - 距离第 1 个星号最近的字符是 "leet**cod*e" 中的 't' ，s 变为 "lee*cod*e" 。
     * - 距离第 2 个星号最近的字符是 "lee*cod*e" 中的 'e' ，s 变为 "lecod*e" 。
     * - 距离第 3 个星号最近的字符是 "lecod*e" 中的 'd' ，s 变为 "lecoe" 。
     * 不存在其他星号，返回 "lecoe" 。
     */
    public static String removeStars(String s) {
        LinkedList<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!='*') {
                queue.offer(chars[i]);
                continue;
            }
            if (chars[i]=='*' && !queue.isEmpty()) {
                queue.removeLast();
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = queue.size();
        while (size > 0) {
            sb.append(queue.removeFirst());
            size--;
        }
        return sb.toString();
    }
}
