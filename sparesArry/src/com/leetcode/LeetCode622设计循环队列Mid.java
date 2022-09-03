package com.leetcode;

public class LeetCode622设计循环队列Mid {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());

    }
    static class MyCircularQueue {
        private int[] queue;
        private int front;
        private int rear;
        private int capacity;
        public MyCircularQueue(int k) {
            capacity = k + 1;
            queue = new int[capacity];
            rear = front = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            queue[rear] = value;
            rear = (rear + 1 ) % capacity;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            front = (front+1) % capacity;
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return queue[front];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return queue[(rear - 1 + capacity) % capacity];
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public boolean isFull() {
            return (rear+1) % capacity == front;
        }
    }
}
