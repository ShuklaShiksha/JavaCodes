package com.practice.searching;

public class LinearSearch {
public static void linearsearchnum(int arr[],int x) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			System.out.println("index at which element got :"+i);
		}
	}
}
	
public static void main(String[] args) {
	int arr[]= {10, 20, 80, 30, 60, 50, 
            110, 100, 130, 170};
	int x=110;
	linearsearchnum(arr,x);
}
}
