package com.atria_day3;
import java.util.LinkedList;


public class Queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		        
		        queue.add(10);  // Add elements
		        queue.add(20);
		        queue.add(30);
		        
		        System.out.println(queue.remove()); // Removes and returns 10
		        System.out.println(queue.peek());   // Returns 20 without removing
		    }



}
