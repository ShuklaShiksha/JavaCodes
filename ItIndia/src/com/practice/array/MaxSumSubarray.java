package com.practice.array;
//consecutive subarray

public class MaxSumSubarray {
	 static int maxsubarraySum(int arr[]) {
		 int res=arr[0];
		 int maxEnding=arr[0];
		 for(int i=1;i<arr.length;i++) {
			 maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			 res=Math.max(res, maxEnding);
		 }
		 return res;
	 }
	 public static void main(String[] args) {
		 int arr[]= {6,8,9};
		 
		System.out.println( maxsubarraySum(arr));
	 }



}
