package org.hvboq.general;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class treeAndDFSBFS {
    @Test
    @DisplayName("treeAndDFSBFS")
    void test() {
        Node<Integer>[] childern1 = new Node[3];
        Node<Integer>[] childern2 = new Node[2];
        childern2[0] = new Node<>(5, null);
        childern2[1] = new Node<>(6, null);
        childern1[0] = new Node<>(2, childern2);
        childern1[1] = new Node<>(3, null);
        childern1[2] = new Node<>(4, null);
        Node<Integer> root = new Node<>(1, childern1);
        DFS(root);
        System.out.println();
        DFSWithStack(root);
        System.out.println();
        BFS(root);
    }

    void DFS(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        if (node.childerns != null) {
            for (Node n : node.childerns) {
                DFS(n);
            }
        }
    }

    void DFSWithStack(Node root) {
        Stack<Node> treeStack = new Stack<>();
        treeStack.push(root);
        while (!treeStack.isEmpty()) {
            Node node = treeStack.pop();
            System.out.println(node.value);
            if (node.childerns != null) {
                for (Node n : node.childerns) {
                    treeStack.push(n);
                }
            }
        }
    }

    void BFS(Node root) {
        Queue<Node> treeQueue = new LinkedList<>();
        treeQueue.offer(root);
        while (!treeQueue.isEmpty()) {
            Node node = treeQueue.poll();
            System.out.println(node.value);
            if (node.childerns != null) {
                for (Node n : node.childerns) {
                    treeQueue.offer(n);
                }
            }
        }
    }

    class Node<E> {
        E value;
        Node<E>[] childerns = null;

        public Node(E value, Node[] childerns) {
            this.value = value;
            this.childerns = childerns;
        }
    }

}
