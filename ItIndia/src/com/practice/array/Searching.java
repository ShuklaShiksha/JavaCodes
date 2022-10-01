package com.practice.array;
//searching unsorted array
public class Searching {
    static int search(int arr[],int n, int x) {
    	for(int i=0;i<n;i++) {
    		

    		if(arr[i]==x) 
    			return(i);
    				
    	}
		return-1;
		
    	
    }
    
    public static void main(String[] args) {
    	int arr[] = {20,5,7,25};
    	int x=25;
    	int n=arr.length;
    	 
    	System.out.println(search(arr, n, x));
        				
        	}

  
}
    	