package com.stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {

        System.out.println("Stack UC-1");
        Stack<Integer> s1 = new Stack<>();
        s1.push(70);
        s1.push(30);
        s1.push(56);
        System.out.println(s1);
        System.out.println("Stack Top : " + s1.peek());

        System.out.println("Stack UC-2");
        Stack<Integer> s2 = new Stack<>();
        s2.push(70);
        s2.push(30);
        s2.push(56);

        System.out.println(s2);
        System.out.println("Deleted Item : " + s2.pop());
        System.out.println(s2);

        System.out.println("Current item at Top : " + s2.peek());

        System.out.println("Deleted Item : " + s2.pop());
        System.out.println(s2);

        System.out.println("Current item at Top : " + s2.peek());

        System.out.println("Deleted Item : " + s2.pop());

        if(s2.empty() == false){
            System.out.println("Stack Is Not Empty");
        }
        else {
            System.out.println("Stack Is Empty");
        }
    }

}

