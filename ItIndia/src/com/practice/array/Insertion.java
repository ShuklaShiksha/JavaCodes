package com.practice.array;
import java.util.Arrays;



import java.util.Scanner;

//write a program to insert an element at given index or position
public class Insertion {
	
	static int  insert(int arr[], int n, int x,int pos, int cap ) {
		
		if(n==cap) {
			return n;
		}
		//int index=pos-1; //index is not equal to position
		for(int i=n;i>pos;i--) {//index is equal to position
			arr[i]=arr[i-1];
			
		}
		arr[pos]=x; 
		 ++n;
		 
		System.out.print("array after insertion");
		 
	    
		for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+",");
	    	
	    }
	    System.out.print("\n");
		return n;
	
		 
		
		
	}
	
	
	 
    public static void main(String[] args) {
    	int cap=9;
    	int arr[] = new int[9];
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter the size of array");
    	int n=sc.nextInt();
    	System.out.println("enter array elements:");
    	for(int i=0; i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	System.out.println("element before insertion");
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ,");
    	}
    	//Insertion
    	System.out.println("enter element to be inserted");
    	int x= sc.nextInt();
    	System.out.println("enter position at which u want to insert");
    	int pos= sc.nextInt();
    	System.out.println(insert(arr,n,x,pos,cap));
    	
    	
        				
     }
}
