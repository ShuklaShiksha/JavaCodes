package com.practice.binaryHeap;

import java.util.Iterator;
import java.util.PriorityQueue;

//find first k largest element
public class KlargestElement {
  public static void main(String[] args) {
	  int arr[]= {5,15,10,20,8,25,18};
	  int n=arr.length;
	  int k=3;
	  firstKelem(arr,n,k);
	  }

  private static void firstKelem(int[] arr, int n, int k) {
	// TODO Auto-generated method stub
	  PriorityQueue <Integer> pq= new PriorityQueue<Integer>();
	for(int i=0;i<k;i++) {
		pq.add(arr[i]);
	}
	for(int i=k;i<n;i++) {
		if(pq.peek()>arr[i]) {
			continue;
		}
		else {
			pq.poll();
			pq.add(arr[i]);
		}
	}
	Iterator it=pq.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	
  }
}
