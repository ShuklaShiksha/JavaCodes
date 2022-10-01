package com.practice.array;

public class MaxConsecutiveOnes {
	
//	static int oneMaxConsecutive(int arr[]) {
//	 int res=0,count=0;
//		int n=arr.length;
//
//	 for(int i=0;i<n;i++ ) {
//		 if(arr[i]==0) {
//			 count=0;
//		 }
//		 else {
//			 count++;
//		 res=Math.max(count, res);
//	 }
//		
//	 }	
//		System.out.println(res);
//		return res;
//	}
//	
//public static void main(String[] args) {
//		int [] arr= {0,1,1,1,0,1,1};
//		oneMaxConsecutive(arr);
//		
//		
//	}
static int oneMaxConsecutive(boolean arr[]) {
	 int res=0,count=0;
		int n=arr.length;

	 for(int i=0;i<n;i++ ) {
		 if(arr[i]==false) {
			 count=0;
		 }
		 else {
			 count++;
		 res=Math.max(count, res);
	 }
		
	 }	
		System.out.println(res);
		return res;
	}

public static void main(String[] args) {
	boolean [] arr= {false, true,true,false,true};
	oneMaxConsecutive(arr);
	

}
}
