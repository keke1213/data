package com.leetcode;

public class LeetCode957 {
    /**
     * 位运算,先把数组化为数字,把数字左移一位与数字右移一位做异或运算后取反,然后与0b01111110做与运算屏蔽掉多余的位就得到下一次迭代的结果,得到一次循环后就不需要再迭代了,通过数学方法算出要返回的值.
     *
     * class Solution:
     *     def prisonAfterNDays(self, cells: List[int], N: int) -> List[int]:
     *         cell,L = sum([cells[i]*(2**(7-i)) for i in range(len(cells))]),[]
     *         while len(L) <2 or L[0] != L[-1]:
     *             cell = ~(cell<<1^cell>>1)&0b01111110
     *             L.append(cell)
     *         return list(bin(L[(N-1)%(len(L)-1)]+0b100000000))[3:]
     */
    public static void main(String[] args) {
//        prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1},8);
        byte one = (byte) 128;
        System.out.println(one ^ 127);
        prisonAfterNDays(new int[]{0,1,0,0,0,0,0,0},8);
    }
    public static int[] prisonAfterNDays(int[] cells, int n) {
        int sum = 0;
        for (int i = 0; i < cells.length; i++) {
            sum = sum * 2 +cells[i];
        }
        while (n > 1) {
            int right = sum << 1;
            int left = sum  >> 1;
            sum = right ^ left;
            n--;
        }

        return null;
    }
}
