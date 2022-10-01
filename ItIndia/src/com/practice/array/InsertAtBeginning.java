package com.practice.array;

import java.util.Arrays;

public class InsertAtBeginning {
	//t.c=O(n)
	
	public static void main(String[] args) {
		int cap=4;
		int arr[]= new int[cap];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		int n=3;
		int pos=1;
		int x=100;
		insert(arr,cap,x,n);
	}

	private static void insert(int[] arr, int cap,int x, int n) {
		// TODO Auto-generated method stub
		if(cap>n) {
			arr[cap-1]=x;
		}
		
		
			System.out.println(Arrays.toString(arr));
		
	}

}
