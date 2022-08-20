package com.bridgelabz;

public class LinkedList {

	Node head;
	Node tail;

	public Node add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void insertAfter(Node prevNode, int data) {
		if (prevNode == null) {
			System.out.println("Prev Node should not be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	public void show() {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public int pop() {
		int popData = 0;
		if (head == null) {
			System.out.println("Stack is empty ");
		}
		popData = head.data;
		head = head.next;
		return popData;
	}
	public void popLast() {
		if (head == null) {
			System.out.println("Stack is empty");
			System.out.println(head.data);
			head = null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		System.out.println("Delete last node::");
	}
	public Node search(int searchData) {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			if (temp.data == searchData) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	public boolean searchInsert(int searchData, int insertData) {
		// TODO Auto-generated method stub
		Node newNode = new Node(insertData);
		Node searchedNode = search(searchData);
		if (searchedNode == null)
			return false;
		else {
			newNode.next = searchedNode.next;
			searchedNode.next = newNode;
			return true;
		}
	}

}
