package com.bridgelabz;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(56);
		list1.add(30);
		list1.add(70);
		list1.show();
		System.out.println(" ");

		LinkedList list2 = new LinkedList();
		list2.push(70);
		list2.push(30);
		list2.push(56);
		list2.show();
		System.out.println(" ");
		
		LinkedList list3 = new LinkedList();
		Node prevNode = list3.add(56);
        list3.add(70);
		list3.show();
        list3.insertAfter(prevNode,  30);
		list3.show();
		System.out.println(" ");
	}
}
