package org.example.algorithms.sem3;

public class Main {
    public static void main(String[] args) {
        LinkedListT<Integer> list = new LinkedListT<>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(20);
        list.add(1);

        list.print();
        System.out.println("_______________");
//        list.remove(2);
//        list.remove(5);
//        list.removeAll(2);
//        list.sort();
        list.reversal();
        list.print();
    }
}