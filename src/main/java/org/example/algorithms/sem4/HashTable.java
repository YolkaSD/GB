package org.example.algorithms.sem4;

import java.util.Objects;

public class HashTable<K, V> {
    private static final int DEFAULT_SIZE = 4;
    private static final double LOAD_FACTOR = 0.75f;
    private int size;
    private Bucket<K, V>[] buckets;

    public HashTable() {
        this(DEFAULT_SIZE);
    }

    public HashTable(int size) {
        if (size <= DEFAULT_SIZE) {
            buckets = new Bucket[DEFAULT_SIZE];
        } else {
            buckets = new Bucket[size];
        }
    }

    public boolean add(K key, V value) {
        if (buckets.length * LOAD_FACTOR < size) {
            resize();
        }
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (Objects.isNull(bucket)) {
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }

        boolean added = bucket.add(key, value);
        if (added) {
            size++;
        }
        return added;
    }

    public boolean remove(K key) {
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (Objects.isNull(bucket)) {
            return false;
        }
        boolean removed = bucket.remove(key);
        if (removed) {
            size--;
        }
        return removed;
    }

    public void print() {
        for (var item : buckets) {
            if (item != null) {
                item.print();
            }
            System.out.println();
        }
    }

    private void resize() {
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket == null) continue;
            Bucket<K, V>.Node currentNode = bucket.root;
            while (currentNode != null) {
                this.add(currentNode.pair.key, currentNode.pair.value);
                currentNode = currentNode.next;
            }
            old[i] = null;

        }
    }

    private int calculateIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }


    private static class Bucket<K, V> {
        Node root;

        public boolean add(K key, V value) {
            Pair pair = new Pair(key, value);
            return this.add(pair);
        }

        public boolean remove(K key) {
            if (Objects.isNull(root)) {
                return false;
            }

            if (root.pair.key.equals(key)) {
                root = root.next;
                return true;
            }

            Node currentNode = root;
            while (Objects.nonNull(currentNode.next)) {
                if (currentNode.next.pair.key.equals(key)) {
                    currentNode.next = currentNode.next.next;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public V getValue(K key) {
            Node currentNode = root;
            while (Objects.nonNull(currentNode)) {
                if (currentNode.pair.key.equals(key)) {
                    return currentNode.pair.value;
                }
                currentNode = currentNode.next;
            }

            return null;
        }

        public boolean set(K key, V value) {
            Node currentNode = root;
            while (Objects.nonNull(currentNode)) {
                if (currentNode.pair.key.equals(key)) {
                    currentNode.pair.value = value;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public void print() {
            Node currentNode = root;
            while (currentNode != null) {
                System.out.print("[ " + currentNode.pair.key + " = " + currentNode.pair.value + " ]");
                currentNode = currentNode.next;
            }
        }

        private boolean add(Pair pair) {
            Node newNode = new Node(pair);
            if (Objects.isNull(root)) {
                root = newNode;
                return true;
            }
            Node currentNode = root;
            while (Objects.nonNull(currentNode)) {
                if (currentNode.pair.key.equals(pair.key)) {
                    return false;
                }
                if (Objects.isNull(currentNode.next)) {
                    currentNode.next = newNode;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        private class Node {
            Pair pair;
            Node next;

            public Node(Pair pair) {
                this.pair = pair;
                this.next = null;
            }
        }

        private class Pair {
            private final K key;
            private V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}