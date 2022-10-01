package com.practice.array;
//efficient way-time comp-o(n)
public class Largest {
	
	static int getLargest(int arr[]) {
		int max=0;
		int n= arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[max]) {
				max=i;


					
				}
			}
		
		System.out.println(arr[max]);
		
		
		
		return max;
		
	}
	

	
	
	
	
	public static void main(String [] args) {
		int arr[]= {5,8,20,10};
		System.out.println(getLargest(arr));
	}
	
	
	
	
}
//	static int getLargest(int arr[]) {0(n2)-time complexity
//		int n=arr.length;
//		for(int i=0;i<n;i++) {
//		   boolean flag=true;	
//		   for(int j=0;j<n;j++) {
//			   if(arr[j]>arr[i]) {
//				   flag=false;
//				   break;
//			   }
//			   
//		   }
//		   if(flag==true)
//			   return i;
//		}
//		
//		
//		
//		return -1;
//		
//	}
//	
//	


