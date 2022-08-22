package com.bridgelabz;

public class LinkedList {

	Node head;
	Node tail;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	public Node search(int searchData) {
		Node temp = head;
		while (temp != null) {
			if (temp.getData() == searchData)
				return temp;
			temp = (Node) temp.getNext();
		}
		return null;
	}

	public boolean searchAndInsert(int searchData, int insertData) {
		Node newMyNode = new Node(insertData);
		Node searchedMyNode = search(searchData);
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
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				temp = (Node) temp.getNext();
			}
			System.out.println();
		}
	}
	public int pop() {
		if (head == null)
			return (Integer) null;
		else {
			int data = head.getData();
			head = (Node) head.getNext();
			return data;
		}
	}
	public int getSize() {
		if (head == null)
			return 0;
		else {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}
	}
	public int popLast() {
		if (head == null) {
			System.out.println("Stack is empty");
			System.out.println(head.getData());
			head = null;
		}
		Node temp = head;
		while (temp.getNext() != tail) {
			temp = temp.getNext();
		}
		int data = tail.getData();
		temp.setNext(null);
		tail = temp;
		return data;
	}
	public void remove(int index){
		int size= getSize();
		if(head == null)
			System.out.println("List is Empty.");
		else if(index < 1 || index > size)
			System.out.println("invalid index");
		else if(index == 1)
				pop();
		else if(index == size)
				popLast();
		else
		{
			Node temp, temp1;
			temp = head;
			for(int i = 1; i < index -1; i++)
			{
				temp = temp.getNext();
			}
			temp1 = temp.getNext();
			temp.setNext(temp1.getNext());
			size--;
		}	
	}
	 public void sort() {
	        Node initialStart = head, index = null;
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        while (initialStart != null) {
	            index = initialStart.getNext();
	            while (index != null) {
	                if (initialStart.getData() > index.getData()) {
	                    int temp = initialStart.getData();
	                    initialStart.setData(index.getData());
	                    index.setData(temp);
	                }
	                index = index.getNext();
	            }
	            initialStart = initialStart.getNext();
	        }
	    }		 
}