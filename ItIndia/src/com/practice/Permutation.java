package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
	
	public static void main(String[] args) {
		int arr[]= {3,0,1,2,5};
		int n=arr.length;
		System.out.println(trapping(arr,n));
	}

	static int trapping(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n<=2) {
			return 0;
		}
		int res=0;
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		leftmax[0]=arr[0];
		rightmax[n-1]=arr[n-1];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(arr[i], leftmax[i]);
		}
		for(int i=n-2;i>=0;i--) {
			Math.max(arr[i], rightmax[i]);
		}
		for(int i=1;i<n;i++) {
			res+=Math.max(leftmax[i],rightmax[i] )-arr[i];
		}
		return res;
	}
}
	
