package org.example.algorithms.lec3;

import java.util.Objects;

public class LinkedListGB {
    private Node head;

    private Node tail;

    private int size;

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.prev = node;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (Objects.nonNull(head)) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public Integer peek() {
        Integer result = null;
        if (Objects.nonNull(tail)) {
            result = tail.value;
            tail.prev.next = null;
            tail = tail.prev;
        }

        return result;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    public void add(int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.prev = node;

        if (next == null) {
            tail = node;
        } else {
            next.prev = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        if (!Objects.nonNull(prev)) {
            next.prev = next;
            head = next;
        } else {
            if (!Objects.nonNull(next)) {
                prev.next = null;
                tail = prev;
            } else {
                prev.next = next;
                next.prev = prev;
            }
        }
    }

    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

//    public void revert() {
//        Node currentNode = head;
//        while (currentNode != null) {
//            Node next = currentNode.next;
//            Node prev = currentNode.prev;
//            currentNode.next = prev;
//            currentNode.prev = next;
//
//            if (!Objects.nonNull(prev)) {
//                tail = currentNode;
//            }
//            if (!Objects.nonNull(next)) {
//                head = currentNode;
//            }
//
//            currentNode = next;
//        }
//    }

    public void revert() {
        if (Objects.nonNull(head) && Objects.nonNull(head.next)) {
            revert(head.next, head);
        }
    }

    private void revert(Node currentNode, Node prevNode) {
        if (!Objects.nonNull(currentNode.next)) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.prev = prevNode;
        prevNode.next = null;
    }
    private static class Node {
        private int value;
        private Node next;
        private Node prev;
    }
}
