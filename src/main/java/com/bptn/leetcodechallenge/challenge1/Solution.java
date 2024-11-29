package com.bptn.leetcodechallenge.challenge1;

public class Solution {
	
	public static double average(int[] salary) {
		
		
		//checking if the length of the salary array is at least 3
		if (salary.length < 3) {
			throw new IllegalArgumentException("Salary array must contain at least 3 unique values.");
		}
		
		//Finding sum of all elements in array
		
		int sum = 0;
		for (int i : salary) {
			sum += i;
		}
		
		//Finding the min and max salary in array
		int min = Integer.MAX_VALUE;
		
		int max = Integer.MIN_VALUE;
		
		for (int i : salary) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		
		//Subtracting the min and max salary from total
		sum -= (min + max);
		
		
		//returning average by dividing sum left with the number of remaining elements 
		return sum/(salary.length - 2);
		
		
	}

	public static void main(String[] args) {

        int[] salary1 = {4000, 3000, 1000, 2000};
        System.out.println("Average Salary: " + average(salary1)); // Expected: 2500.0

        int[] salary2 = {1000, 2000, 3000};
        System.out.println("Average Salary: " + average(salary2)); // Expected: 2000.0

	}

}
