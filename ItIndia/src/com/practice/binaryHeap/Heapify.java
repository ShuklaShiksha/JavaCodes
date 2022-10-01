package com.practice.binaryHeap;
//heapify and extract operation
public class Heapify {
   int arr[];
   int capacity;
   int size;
   Heapify(int cap){
	   arr=new int [cap];
	   capacity=cap;
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
   void insert(int x) {
	 if(size==capacity) return;
	 size++;
	 arr[size-1]=x;
	 int i=size-1;
	 while(i!=0 && arr[parent(i)]>arr[i]) {
		 int temp=arr[i];
		 arr[i]=arr[parent(i)];
		 arr[parent(i)]=temp;
		 i=parent(i);
	 }
   }
   void minHeapify(int i) {
	   int lt=left(i), rt=left(i);
	   int smallest=i;
	   if(lt<size && arr[lt]<arr[i]) {
		   smallest=lt;
	   }
	   if(rt<size && arr[rt]<arr[smallest]) {
		   smallest=rt;
	   }
	   if(smallest!=i) {
		   int temp=arr[i];
		   arr[i]=arr[smallest];
		   arr[smallest]=temp;
		   minHeapify(smallest);
	   }
   }
   //extract min
   int extractMin() {
	   if(size<=0) return Integer.MAX_VALUE;
	   if(size==1) {
		   size--;
		   return arr[0];
	   }
	   int temp=arr[0];
	   arr[0]=arr[size-1];
	   arr[size-1]=temp;
	   size--;
	   minHeapify(0);
	return arr[size];
   }
   //decrease key operation
   void decreaseKey(int i, int x) {
	   arr[i]=x;
	   while(i!=0 && arr[parent(i)]>arr[i]) {
		   int temp=arr[i];
		   arr[i]=arr[parent(i)];
		   arr[parent(i)]=temp;
		   i=parent(i);
	   }
   }
   void delete(int i) {
	   decreaseKey(i,Integer.MIN_VALUE);
	   extractMin();
   }
   void print() {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
   }
   public static void main(String[] args) {
	   Heapify heap= new Heapify(10);
	   heap.insert(10);
	   heap.insert(20);
	   heap.insert(40);
	   heap.insert(80);
	   heap.insert(100);
	   heap.insert(70);
//	   heap.insert(40);
//	   heap.insert(20);
//	   heap.insert(30);
//	   heap.insert(35);
//	   heap.insert(25);
//	   heap.insert(80);
//	   heap.insert(32);
//	   heap.insert(100);
//	   heap.insert(70);
//	   heap.insert(60);
	   //heap.minHeapify(0);
      // heap.decreaseKey(3, 5);
       heap.delete(3);;
	   heap.print();

   }
}
