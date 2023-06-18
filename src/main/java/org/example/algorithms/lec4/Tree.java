package org.example.algorithms.lec4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tree {
    Node root;

    public boolean exist(int value) {
        Node node = findNode(root, value);
        return Objects.nonNull(node);
    }

    private Node findNode(Node node,int value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child: node.children) {
                Node result = findNode(child, value);
                if (Objects.nonNull(result)) {
                    return result;
                }
            }
        }
        return null;
    }

    private Node findNode(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

    public class Node{
        private int value;
        List<Node> children;
    }
}
