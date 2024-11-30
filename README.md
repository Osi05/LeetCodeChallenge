# Java Solutions to LeetCode Challenge
This repository contains solutions to five LeetCode challenges implemented in Java by Section 1 Team 11.

## Overview of Problems

## 1. Calculate Average Salary Excluding the Minimum and Maximum

### Problem Statement: 
- Given an array of unique salary values, calculate the average salary excluding the minimum and maximum salaries.

### Key Concepts:
- Iterating through arrays.
- Basic math operations for calculating averages.
- Identifying the minimum and maximum elements in an array.

### Solution Summary:
- Find the sum of all salaries.
- Identify and subtract the minimum and maximum salaries from the sum.
- Return the average of the remaining salaries.

## 2. Sorted Squares of a Sorted Array

### Problem Statement: 
- Given a sorted integer array, return an array of the squares of each number sorted in non-decreasing order.

### Key Concepts:
- Two-pointer technique for efficient sorting.
- Handling negative and positive numbers in the same array.

### Solution Summary:
- Use two pointers, one at the beginning and one at the end of the array.
- Compare the squares of the values at the pointers and insert the larger square at the end of the result array.

## 3. Find the Missing Number in an Array

### Problem Statement: 
- Given an array containing numbers in the range [0, n] with one number missing, find the missing number.

### Key Concepts:
- Arithmetic progression sum formula.
- Comparing expected and actual sums to find the missing number.

### Solution Summary:
- Compute the expected sum using the formula 𝑛( 𝑛 + 1 ) / 2
- Subtract the actual sum of the array elements from the expected sum to identify the missing number.
## 4. Add Two Numbers Represented by Linked Lists

### Problem Statement: 

- Given two linked lists representing two non-negative integers.
- Add the numbers and return the sum as a linked list.

### Key Concepts:
- Linked list traversal and manipulation.
- Handling carries in addition operations.

### Solution Summary:
- Traverse the linked lists node by node, adding corresponding digits and tracking carry values.
- Create a new linked list to store the result.

## 5. Merge Two Sorted Linked Lists

### Problem Statement:
- Given two sorted linked lists, merge them into a single sorted linked list.

### Key Concepts:
- Recursion for merging lists.
- Base cases for empty lists.

### Solution Summary:
- Compare the head nodes of both lists and recursively merge the smaller node into the result.