package com.practice.array;
//given an array of integer, find it has an equilibruim point- a point where sum of element before it is equal to sum after it.
public class EquilibruimPoint {
	static void equilpoint(int arr[], int n) {
	  int sum=0;
	  for(int i=0;i<n;i++) {
		  sum+=arr[i];
	  }
	  int l_sum=0;
	  for(int i=0;i<n;i++) {
		  sum-=arr[i];
		  if(l_sum==sum) {
			  System.out.println(arr[i]);
		  }
		  else {
			  l_sum+=arr[i];
		  }
	  }
	  
	}
 public static void main(String[] args) {
	 int arr[] = {3,4,8,-9,20,6};
 	
 	 int n=arr.length;
 	equilpoint(arr, n);
 }
}
