package com.practice.binaryHeap;

public class BuildHeap {
 static  int arr[];
 static  int capacity;
 static  int size;
  BuildHeap(int cap){
	  arr= new int[cap];
	  capacity=cap;
	  size=0;
  }
  static int right(int i){
	  return 2*i+1;
  }
  static int left(int i) {
	  return 2*i+2;
  }
 static int parent(int i) {
	  return(i-1)/2;
  }
  
  
  static void minHeapify(int i) {
	  int lt=left(i),rt=right(i);
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
  //build heap
 static void buildHeap() {
	  for(int i=(size-2)/2;i>=0;i--) {
		  minHeapify(i);
	  }
  }
  public static void main(String[] args) {
	  BuildHeap hp= new BuildHeap(11);
	buildHeap();
    print();
  }
static void print() {
	// TODO Auto-generated method stub
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
