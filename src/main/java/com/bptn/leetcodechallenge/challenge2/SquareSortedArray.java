package com.bptn.leetcodechallenge.challenge2;

import java.util.Arrays;

public class SquareSortedArray {

	public static int[] sortedSquares(int[] nums) {

		// array to store the sorted squares
		int[] result = new int[nums.length];

		// initializing pointers
		int left = 0;
		int right = nums.length - 1;

		// start sorting from the end, largest squares will be placed first
		int index = nums.length - 1;

		while (left <= right) {

			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			// Compare squares and place the larger one in the result array
			if (leftSquare > rightSquare) {
				result[index] = leftSquare;
				left++;
			} else {
				result[index] = rightSquare;
				right--;
			}
			index--;
		}

		return result;
	}

	public static void main(String[] args) {

		// Example 1
		int[] nums1 = { -4, -1, 0, 3, 10 };
		System.out.println("Output: " + Arrays.toString(sortedSquares(nums1)));
		// Expected: [0, 1, 9, 16, 100]

		// Example 2
		int[] nums2 = { -7, -3, 2, 3, 11 };
		System.out.println("Output: " + Arrays.toString(sortedSquares(nums2)));
		// Expected: [4, 9, 9, 49, 121]

	}

}
