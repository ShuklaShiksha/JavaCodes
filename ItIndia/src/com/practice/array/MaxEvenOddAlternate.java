package com.practice.array;

public class MaxEvenOddAlternate {
	static int maxEvenoddSubarray(int arr[]) {
	 int res=1;
	 int count=1;
	 for(int i=1;i<arr.length;i++) {
		if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 )&& (arr[i-1]%2==0)){
			count++;
			res=Math.max(count, res);
		}
		else {
			count=1;
		}
	 }
    System.out.println(res);

	 return res;
	 }
	public static void main(String[] args) {
		int arr[]= {5,10,20,6,3,8};
		maxEvenoddSubarray(arr);
	}

}
