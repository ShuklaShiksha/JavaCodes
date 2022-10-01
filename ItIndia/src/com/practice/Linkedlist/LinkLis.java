package com.practice.Linkedlist;

public class LinkLis {
   Node head;
   Node tail;
   int size;
   public LinkLis() {
	   this.size=size;
   }
  class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		
	}
	
  }
	


public void insertFirst(int i) {
	// TODO Auto-generated method stub
	Node temp=new Node(i);
	temp.next=head;
	head=temp;
	if(tail==null) {//corner case
		tail=head;
	}
	size+=1;
}
public void insertLast(int x) {
	if(tail==null) {//corner case
		insertFirst(x);
		return;
	}
	Node temp1=new Node(x);
	tail.next=temp1;
	temp1=tail;
	size++;
}

public void insert(int y, int index) {
	if(index==0) {
		insertFirst(y);
		return;
	}
	if(index==size) {
		insertLast(y);
		return;
	}
	Node temp=head;
	for(int i=1;i<index;i++) {
		temp=temp.next;
	}
	if(temp==null) {
		return ;
	}
	Node newEle=new Node(y);
	newEle.next=temp.next;
	temp.next=newEle;
	
	
}
public int deleteFirst() {
	int data=head.data;
	head=head.next;
	if(head==null) {
		tail=null;
	}
	size--;
	return data;
}
public int deleteLast() {
	if(size<=1) {
		return deleteFirst();
		
	}
	Node secondLast=get(size-2);
	int data=tail.data;
	tail=secondLast;
	tail.next=null;
	return data;
}
public int delete(int index) {
	if(index==0) {
		return deleteFirst();
		
	}
	if(index==size-1) {
		return deleteLast();
	}
	Node prev=get(index-1);
	int data=prev.next.data;
	prev.next=prev.next.next;
	return data;
	
}
public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("end");

}
public Node get(int index ){
	Node temp=head;
	for(int i=0;i<index;i++) {
		temp=temp.next;
	}
	return temp;
	
}
public int find(int z) {
	int position=0;
	Node temp=head;
	while(temp!=null) {
		if(temp.data == z) {
			return position;
			
		}
		temp=temp.next;
		position++;
	}
	return 0;
}

public static void main(String[] args) {
	 LinkLis ll=new LinkLis();
	 ll.insertFirst(1);
	 ll.insertFirst(6);
	 ll.insertFirst(7);
	 ll.insertFirst(99);
	 ll.insertFirst(54);

    ll.insertLast(9);
    ll.insert(5,2);
	 ll.display();
	 System.out.println("");
	 ll.deleteFirst();
	 ll.display();
	 System.out.println("");
	 ll.deleteLast();
	 ll.display();
	 System.out.println("");

	 ll.delete(2);
	 ll.display();
	 System.out.println(" ");

	 int t=ll.find(5);
	 System.out.println(t);
	 ll.display();
}

}