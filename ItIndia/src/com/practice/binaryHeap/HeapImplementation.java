package com.practice.binaryHeap;
//implements the insertion method of Binary Heap.
public class HeapImplementation {
	int arr[];
	int size;
	int capcity;
	HeapImplementation(int cap){//constructor with capacity as argument
		arr=new int[cap];
		capcity=cap;
		size=0;
		
	}
	int left(int i) {
		return 2*i+1;
    }
	int right(int i) {
		return 2*i+2;
	}
	int parent(int i) {
		return (i-1)/2;
	}
	//binary heap insert
	void insert(int x) {
		if(size==capcity) return;
		size++;
		arr[size-1]=x;
		int i=size-1;
		while(i!=0 && arr[parent(i)]>arr[i]){
			int temp=arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=temp;//swap(arr[i],arr[parent(i)])
			i=parent(i);
		}
	}
	
	public static void main(String args[]) {
		HeapImplementation ob= new HeapImplementation(10);
		ob.insert(10);
		ob.insert(20);
		ob.insert(15);
		ob.insert(40);
		ob.insert(50);
		ob.insert(100);
		ob.print();

		
	}
	private void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
