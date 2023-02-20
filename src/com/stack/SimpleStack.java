package com.stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {

        System.out.println("Stack UC-1");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        System.out.println(stack1);
        System.out.println("Stack Top : " + stack1.peek());

    }
}
