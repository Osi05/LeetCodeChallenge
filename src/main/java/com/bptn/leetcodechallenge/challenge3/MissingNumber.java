package com.bptn.leetcodechallenge.challenge3;

public class MissingNumber {

	public static int findMissingNumber(int[] numbers) {

		// calculating length of array
		int number = numbers.length;

		// calculate expected sum of numbers from 0 to n
		int expectedSum = number * (number + 1) / 2;

		// calculating actual sum
		int actualSum = 0;

		for (int num : numbers) {
			actualSum += num;
		}

		// returning missing number
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {

		// Example 1
		int[] nums1 = { 3, 0, 1 };
		System.out.println("Missing Number: " + findMissingNumber(nums1));
		// Expected Output: 2

		// Example 2
		int[] nums2 = { 0, 1 };
		System.out.println("Missing Number: " + findMissingNumber(nums2));
		// Expected Output: 2

		// Example 3
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println("Missing Number: " + findMissingNumber(nums3));
		// Expected Output: 8

	}

}
