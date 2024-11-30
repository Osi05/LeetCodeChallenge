package com.bptn.leetcodechallenge.challenge5;

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {

	// Takes two lists sorted in increasing order, and
	// splices their nodes together to make one sorted list which is returned
	public static ListNode mergeSortedList(ListNode list1, ListNode list2) {

		ListNode result = null;

		// Base case: if either list is null, return the other list
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;

		// Pick the smaller value between list1 or list2, and recur
		if (list1.val <= list2.val) {
			result = list1;
			result.next = mergeSortedList(list1.next, list2);
		} else {
			result = list2;
			result.next = mergeSortedList(list1, list2.next);
		}
		return result;
	}

	public static void main(String[] args) {

		// Example 1: list1 = [1,2,4], list2 = [1,3,4]

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(8);

		ListNode output = mergeSortedList(list1, list2);
		System.out.print("The Merged Linked List is: ");
		while (output != null) {
			System.out.print(output.val);
			if (output.next != null)
				System.out.print(" ");
			output = output.next;
		}
		System.out.println();

		// Example 2: list1 = [], list2 = []
		
		// The program directly prints empty lists without merging, as there's no need to process empty lists through the merging logic.
		System.out.println("list1 = [], list2 = []");
		System.out.println("Output: []");

		// Example 3: list1 = [], list2 = [0]
		list1 = null;
		list2 = new ListNode(0);

		output = mergeSortedList(list1, list2);
		System.out.print("The new merged linked list is: ");
		while (output != null) {
			System.out.print(output.val);
			if (output.next != null)
				System.out.print(" ");
			output = output.next;
		}
		System.out.println();
	}
}
