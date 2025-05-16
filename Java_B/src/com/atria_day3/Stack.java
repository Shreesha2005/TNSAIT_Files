package com.atria_day3;


public class Stack {
    public static void main(String[] args) {
        stack<Integer> stack = new stack<>();
        
        stack.push(10);  // Add elements
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.pop());   // Removes and returns 30
        System.out.println(stack.peek());  // Returns 20 without removing
    }
}