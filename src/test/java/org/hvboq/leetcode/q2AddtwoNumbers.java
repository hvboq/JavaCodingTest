package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q2AddtwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode l1CurrentNode = l1;
//        ListNode l2CurrentNode = l2;
//
//        boolean olim = false;
//        Stack<Integer> answerStack = new Stack<>();
//        while (l1CurrentNode != null || l2CurrentNode != null || olim) {
//            int currentInteger = olim ? 1 : 0;
//            if (l1CurrentNode != null) {
//                currentInteger += l1CurrentNode.val;
//                l1CurrentNode = l1CurrentNode.next;
//            }
//            if (l2CurrentNode != null) {
//                currentInteger += l2CurrentNode.val;
//                l2CurrentNode = l2CurrentNode.next;
//            }
//            if (currentInteger > 9) {
//                olim = true;
//                currentInteger -= 10;
//            } else {
//                olim = false;
//            }
//            System.out.println(currentInteger);
//            answerStack.push(currentInteger);
//        }
//
//        ListNode answerNode = null;
//        while (!answerStack.empty()) {
//            ListNode currentNode = new ListNode(answerStack.pop(), answerNode);
//            answerNode = currentNode;
//        }
//
//        return answerNode;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode front = null;
        ListNode rear = null;

        boolean olim = false;
        while (l1 != null || l2 != null || olim) {
            int currentInteger = olim ? 1 : 0;
            if (l1 != null) {
                currentInteger += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentInteger += l2.val;
                l2 = l2.next;
            }
            if (currentInteger > 9) {
                olim = true;
                currentInteger -= 10;
            } else {
                olim = false;
            }

            if (front == null) {
                front = new ListNode(currentInteger);
                rear = front;
            } else {
                rear.next = new ListNode(currentInteger);
                rear = rear.next;
            }
        }

        return front;
    }

    @Test
    @DisplayName("q2AddtwoNumbers")
    void test() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        addTwoNumbers(l1, l2);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
