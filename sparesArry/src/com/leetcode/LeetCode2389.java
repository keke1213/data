package com.leetcode;

import java.util.Arrays;

public class LeetCode2389 {
    public static void main(String[] args) {

    }

    /**
     *输入：nums = [4,5,2,1], queries = [3,10,21]
     * 输出：[2,3,4]
     * 解释：queries 对应的 answer 如下：
     * - 子序列 [2,1] 的和小于或等于 3 。可以证明满足题目要求的子序列的最大长度是 2 ，所以 answer[0] = 2 。
     * - 子序列 [4,5,1] 的和小于或等于 10 。可以证明满足题目要求的子序列的最大长度是 3 ，所以 answer[1] = 3 。
     * - 子序列 [4,5,2,1] 的和小于或等于 21 。可以证明满足题目要求的子序列的最大长度是 4
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        int length = queries.length;
        int[] answer = new int[length];
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            int count = 0;
            int value = 0;
            for (int j = 0; j < nums.length; j++) {
                value += nums[j];
                if (value > queries[i]) {
                    break;
                }
                count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
