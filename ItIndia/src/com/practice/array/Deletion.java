package com.practice.array;

import java.util.Scanner;

public class Deletion {
	//delete an element when position/index is known 
	static void delete(int arr[],int n, int x ) {

	       int i, inx=0;
	       for(i=0;i<n;i++) {
	    	  if(arr[i]==x) {
	    		inx=i;
	    		break;
	    	  }
	    	  
	       }
	       for(i=inx+1;i<n;i++) {
	    	   arr[i-1]=arr[i];
	    	   //System.out.println(arr[inx]);
	       }
	       n--;
	       for( i=0;i<n;i++) {
	    	   System.out.print(arr[i]+" ");
	       }
		}
		public static void main(String[] args) {
			   int n=3;

		   int arr[]=new int [n];
	       arr[0]=4;
	       arr[1]=5;
	       arr[2]=7;
		   for(int i=0;i<n;i++) {
			   
			  System.out.print(arr[i]+" ");
		   }
		   System.out.println("");
		   int x=5;
		   
		   delete(arr,n,x);
		}
}