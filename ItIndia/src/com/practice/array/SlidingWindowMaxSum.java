package com.practice.array;
//given array of integer and a number k,find the max sum of k consecutive elements
public class SlidingWindowMaxSum {
//	static int maxConsecutiveSumSubarray(int arr[],int k) {
//		int curr_sum=0;
//		for(int i=0;i<k;i++){
//		   curr_sum+=arr[i];	
//		}
//		int max_sum=curr_sum;
//		for(int i=k;i<arr.length;i++) {
//			curr_sum+=arr[i]-arr[i-k];
//			max_sum=Math.max(max_sum,curr_sum );
//			
//		}
//		System.out.println(max_sum);
//		return max_sum;
//	}
//	public static void main(String[] args) {
//		int arr[]= {1,8,30,-5,20,7};
//		int k=3;
//		maxConsecutiveSumSubarray(arr,k);
//	}


//given sum =45,and k=3, we need to find if there is sub array with given sum or not
	static int maxConsecutiveSumSubarray(int arr[],int k, int sum) {
		int curr_sum=0;
		for(int i=0;i<k;i++){
		   curr_sum+=arr[i];	
		}
		int max_sum=curr_sum;
		for(int i=k;i<arr.length;i++) {
			curr_sum+=arr[i]-arr[i-k];
			max_sum=Math.max(max_sum,curr_sum );
			
		}
		if(curr_sum==sum) {
			System.out.println("given sum exist");

		}
		System.out.println(max_sum);
		return max_sum;
	}
	public static void main(String[] args) {
		int arr[]= {1,8,30,-5,20,7};
		int k=3;
		int sum=22;
		maxConsecutiveSumSubarray(arr,k,sum);
	}
}