package com.practice.array;
//given a fixed array and multiple queries .how to efficiently perform queries.queries consist of left and right index.
//need to find sum in between:getsum(0,2) or get sum(1,3)...
//prefix sum{2,10,13,22,28,33,37}
public class PrefixSumQueries {
	static void prefixSum(int arr[], int n) {
		int prefsum[]=new int[n];
		prefsum[0]=arr[0];
		for(int i=1;i<n;i++) {
			prefsum[i]=arr[i]+prefsum[i-1];
		}
		int l=2, r=6;
		getsum(prefsum,l,r);
		
	}
	static void getsum(int prefsum[], int l, int r ) {
		int sum;
		if(l!=0) {
			 sum= prefsum[r]-prefsum[l-1];
			
		}
		else {
			 sum= prefsum[r];
		}
		System.out.println(sum);
	}
  public static void main (String[] args) {
	  int arr[]= {2,8,3,9,6,5,4};
	  int n=arr.length;
	  prefixSum(arr,n);
	  
  }
}
