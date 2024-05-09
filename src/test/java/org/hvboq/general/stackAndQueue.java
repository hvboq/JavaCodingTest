package org.hvboq.general;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackAndQueue {
    @Test
    @DisplayName("stackAndQueue")
    void test() {
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        Stack<Integer> javaStack = new Stack<>();
        javaStack.push(Integer.valueOf(1));
        javaStack.push(Integer.valueOf(2));
        javaStack.push(Integer.valueOf(3));
        javaStack.push(Integer.valueOf(4));
        System.out.println(javaStack.peek());
        while (!javaStack.empty()) {
            System.out.println(javaStack.pop().intValue());
        }
        System.out.println();

        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<Integer> javaQueue = new LinkedList<>();
        javaQueue.offer(1);
        javaQueue.offer(2);
        javaQueue.offer(3);
        javaQueue.offer(4);
        System.out.println(javaQueue.peek());
        while (!javaQueue.isEmpty()) {
            System.out.println(javaQueue.poll());
        }
    }

    class LinkedNode<E> {
        E value;
        LinkedNode<E> next;

        public LinkedNode(E value, LinkedNode<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    class LinkedStack<E> {
        LinkedNode<E> head;

        public LinkedStack() {
        }

        public LinkedStack(LinkedNode<E> head) {
            this.head = head;
        }

        public void push(E value) {
            head = new LinkedNode<>(value, head);
        }

        public E peek() {
            if (this.empty()) {
                System.out.println("stack is empty");
                return null;
            }
            return head.value;
        }

        public E pop() {
            if (this.empty()) {
                System.out.println("stack is empty");
                return null;
            }
            E value = head.value;
            head = head.next;
            return value;
        }

        public boolean empty() {
            return head == null;
        }

        public boolean isEmpty() {
            return this.empty();
        }
    }

    class LinkedQueue<E> {
        LinkedNode<E> front, rear;

        public LinkedQueue() {

        }

        public LinkedQueue(LinkedNode<E> node) {
            this.front = node;
            this.rear = node;
        }

        public void offer(E value) {
            if (front == null) {
                this.front = new LinkedNode<>(value, null);
                this.rear = this.front;
            } else {
                this.rear.next = new LinkedNode<>(value, null);
                this.rear = this.rear.next;
            }
        }

        public void add(E value) {
            this.offer(value);
        }

        public E peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return null;
            }
            return front.value;
        }

        public E poll() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return null;
            }
            E value = front.value;
            front = front.next;
            return value;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }
}
