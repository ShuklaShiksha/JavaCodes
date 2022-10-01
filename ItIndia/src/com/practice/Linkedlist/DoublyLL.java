package com.practice.Linkedlist;

import java.util.LinkedList;

public class DoublyLL {
Node head;
Node tail;
int size;
DoublyLL(){
	this.size=size;
}
class Node{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data=x;
		next=null;
		prev=null;
	}
}
public void insertFirst(int x) {
	Node temp=new Node(x);
	temp.next=head;
	temp.prev=null;
	if(head!=null) {
	head.prev=temp;
	}
	head=temp;
}
public void insertLast(int z) {
	Node node=new Node(z);
	node.next=null;
	if(head==null) {
		head.prev=null;
		head=node;
		return;
   }
	Node last=head;
    while(last.next!=null) {
    	last=last.next;
    }
	last.next=node;
	node.prev=last;
}
public void insertAft(int after, int z) {
	Node p=find(after);
	if(p==null) {
		System.out.println("doesnot exist");
		return;
	}
	Node temp=new Node(z);
	temp.next=p.next;
	temp.prev=p;
	p.next=temp;
	if(temp.next!=null) {
	   temp.next.prev=temp;
	}
}
public void display() {
	Node temp=head;
	Node last=null;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		last=temp;
		temp=temp.next;
	}
	System.out.println(" ");
	System.out.println("print in reverse ");
	while(last!=null) {
		System.out.print(last.data+"->");
		last=last.prev;
	}
	System.out.println(" ");
}
public Node find(int x) {
	Node node=head;
	while(node!=null) {
		if(node.data==x) {
			return node;
		}
		node=node.next;
	}
	return null;
}
public static void main(String[] args) {
	DoublyLL ll=new DoublyLL();
	ll.insertFirst(5);
	ll.insertFirst(9);
	ll.insertFirst(7);
	ll.insertFirst(3);
    ll.display();
    ll.insertLast(8);
    System.out.println(" ");
    ll.display();
    ll.insertAft(9, 100);
    ll.display();
}
	
	
	
}
