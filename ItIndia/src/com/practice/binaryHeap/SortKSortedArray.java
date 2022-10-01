package com.practice.binaryHeap;

import java.util.PriorityQueue;

//sort a nearly sorted or k sorted array
public class SortKSortedArray {
   public static void main(String[] args) {
	   int arr[] = {9,8,7,19,18};
	   int k=2;
	   sort(arr,k);
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
   }

private static void sort(int[] arr, int k) {
	// TODO Auto-generated method stub
	PriorityQueue <Integer> pq= new PriorityQueue<Integer>();
	for(int i=0;i<=k;i++) {
		pq.add(arr[i]);
	}
	int index=0;
	for(int i=k+1;i<arr.length;i++) {
		arr[index++]=pq.poll();
		pq.add(arr[i]);
	}
	while(pq.isEmpty()==false) {
		arr[index++]=pq.poll();
	}
}
}
