package org.example.lectureapi.lec4;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(123);
//        pq.add(122);
//        pq.add(12);
//        pq.add(1);
//        System.out.println(pq);

        String[] exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> stack = new Stack<>();
        for (String s : exp) {
            if (isNumeric(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                switch (s) {
                    case "+":
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                        break;
                    case "-":
                        res = -stack.pop() + stack.pop();
                        stack.push(res);
                        break;
                    case "*":
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                        break;
                    case "/":
                        res = stack.pop() / stack.pop();
                        stack.push(res);
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(res);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}
