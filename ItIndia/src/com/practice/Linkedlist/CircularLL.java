package com.practice.Linkedlist;

public class CircularLL {  Node head;
 private Node tail;
 class Node{
	 int data;
	 Node next;
	 Node(int x){
		 data=x;
	 }
 }
	 public void insert(int x) {
		Node temp=new Node(x);
		if(head==null) {
			head=temp;
			tail=temp;
			return;
		}
		tail.next=temp;
		temp.next=head;
		tail=temp;
		
	 }
	 public void display() {
		 Node temp=head;
		 if(head!=null) {
			 do {
				 System.out.print(temp.data+"->");
				 temp=temp.next;
			 }
			 while(temp!=head);
		 }
	 }
	 public static void main(String[] args) {
		 CircularLL list =new CircularLL();
		 list.insert(9);
		 list.insert(7);
		 list.insert(4);
		 list.display();

	 }
 
}
