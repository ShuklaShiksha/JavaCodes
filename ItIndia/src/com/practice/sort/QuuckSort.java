package com.practice.sort;

import java.util.Arrays;

public class QuuckSort {
  static void sot(int arr[], int low, int high) {
	  if(low>=high) {
		  return;
	  }
	  int s=low;
	  int e=high;
	  int mid=s+(e-s)/2;
	  int pivot=arr[mid];
	  if(pivot>arr[s]) {
		  s++;
	  }
	  if(arr[e]>pivot) {
		  e--;
	  }
	  if(s<=e) {
		  int temp=arr[s];
		  arr[s]=arr[e];
		  arr[e]=temp;
		  s++;
		  e--;
	  }
	  sot(arr,low,e);
	  sot(arr,s,high);
  }
  public static void main(String[] args) {
	  int arr[]= {4,3,5,2,1};
	  sot(arr,0,arr.length-1);
	  System.out.println(Arrays.toString(arr));
  }
}
