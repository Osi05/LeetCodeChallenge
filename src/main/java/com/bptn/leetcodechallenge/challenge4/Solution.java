package com.bptn.leetcodechallenge.challenge4;

//Definition for singly-linked list. 
class ListNode {
	int val;
	ListNode next;

	// creating overloading method for ListNode. One, will be empty, the next will
	// have 1 parameter and the last, 2 parameters.
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
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		// new dummy list to take the result
		ListNode head = new ListNode(0);

		ListNode current = head;

		int remainder = 0;

		// Looping through both lists
		while (l1 != null || l2 != null) {

			// Sets val1/val2 to l1.val/l2.val if not null, else defaults to 0.
			int val1 = l1 != null ? l1.val : 0;
			int val2 = l2 != null ? l2.val : 0;

			int sum = val1 + val2 + remainder;

			remainder = sum / 10;

			current.next = new ListNode(sum % 10);

			current = current.next;
			// Moves l1/l2 to the next node, and sets as null if it's already null
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		if (remainder > 0) {
			current.next = new ListNode(remainder);
		}
		return head.next;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		// Example 1
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

		ListNode firstResult = solution.addTwoNumbers(l1, l2);

		while (firstResult != null) {
			System.out.print(firstResult.val);
			if (firstResult.next != null) {
				System.out.print(",");
			}
			firstResult = firstResult.next;
		}
		System.out.println();

		// Example 2
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(0);

		ListNode secondResult = solution.addTwoNumbers(l3, l4);

		System.out.print("Example 2 Result: ");
		while (secondResult != null) {
			System.out.print(secondResult.val);
			if (secondResult.next != null) {
				System.out.println(",");
			}
			secondResult = secondResult.next;
		}
		System.out.println();

		// Example 3
		ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))));

		ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

		ListNode thirdResult = solution.addTwoNumbers(l5, l6);

		System.out.print("Example 3 Result: ");
		while (thirdResult != null) {
			System.out.print(thirdResult.val);
			if (thirdResult.next != null)
				;
			{
				System.out.print(",");
			}
			thirdResult = thirdResult.next;
		}
		System.out.println();
	}
}