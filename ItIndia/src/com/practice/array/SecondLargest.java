package com.practice.array;
//second largest element
public class SecondLargest {
	
	static int getSecondLarg(int arr[]) {
		int n=arr.length;
		int secMax=-1,  max=0;
	
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[max]) {
				secMax=max;
				max=i;
				
			}
			else if(arr[i]!=arr[max]){
				if(secMax==-1 || arr[i]>arr[secMax]) {
					secMax=i; 
				}
				
			}
			
		}
		System.out.println("second max: "+arr[secMax]+"\n max :"+arr[max]);
		System.out.println("\n");
		return secMax;
		
	}
	
	
	
	public static void main(String [] args) {
		int arr[]= {5,20,12,20,8};
		System.out.println(getSecondLarg(arr));
	}

}
