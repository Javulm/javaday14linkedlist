package com.bridgelabz;

public class LinkedList<T> {

	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	public Node<T> search(T searchData) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getData().equals(searchData))
				return temp;
			temp = (Node<T>) temp.getNext();
		}
		return null;
	}

	public boolean searchAndInsert(T searchData, T insertData) {
		Node<T> newMyNode = new Node(insertData);
		Node<T> searchedMyNode = search(searchData);
		if (searchedMyNode == null)
			return false;
		else {
			newMyNode.setNext(searchedMyNode.getNext());
			searchedMyNode.setNext(newMyNode);
			return true;
		}
	}
	public void show() {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node<T> temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				temp = (Node<T>) temp.getNext();
			}
			System.out.println();
		}
	}
	public T pop() {
		if (head == null)
			return null;
		else {
			T data = head.getData();
			head = (Node<T>) head.getNext();
			return data;
		}
	}
	public T popLast() {
		if (head == null) {
			System.out.println("Stack is empty");
			System.out.println(head.getData());
			head = null;
		}
		Node<T> temp = head;
		while (temp.getNext() != tail) {
			temp = temp.getNext();
		}
		T data = tail.getData();
		temp.setNext(null);
		tail = temp;
		return data;
	}
	
}
