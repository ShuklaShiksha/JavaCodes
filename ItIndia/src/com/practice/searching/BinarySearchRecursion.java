package com.practice.searching;

public class BinarySearchRecursion {
	
		
	 //binary search-sorted array-0(logn)
		static int recsort(int arr[], int l, int r, int x) {
		
			while(r>=1) {
				int mid=l+(r-l)/2;
				if(arr[mid]==x) {
					return mid;
				}
			    if(arr[mid]>x) {
					 return recsort(arr,l,mid-1,x);
				}
				
			    return  recsort(arr,mid+1,r,x);
				
			}
			return -1;
		}
		public static void main(String[] args) {
			int arr[]= {2,3,4,10,40};
			int x=10;
			int l=0, r=arr.length-1;
			int res=recsort(arr,l,r,x);
			if(res==-1) {
				System.out.println("not found");
			}
			else {
				System.out.println("found "+ res);
			}
		}
	}	
