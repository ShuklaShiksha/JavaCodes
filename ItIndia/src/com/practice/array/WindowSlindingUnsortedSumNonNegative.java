package com.practice.array;
//given an unsorted array of non-negative integers. find if there is subarray with given sum
public class WindowSlindingUnsortedSumNonNegative {
	static int isSubSum(int arr[], int sum) {
		int curr_sum=arr[0],s=0;
		for(int e=1;e<arr.length;e++) {
			while(curr_sum>sum &s<e-1) {
				curr_sum-=arr[s];
				s++;
			}
			if(curr_sum==sum){
				System.out.println("sum found");
				return sum;
			}
			if(e<arr.length) {
				curr_sum+=arr[e];


             }
		}
		System.out.println("no subarray sum found");
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {1,4,20,3,10,5};
		int sum=33;
		isSubSum(arr,sum);
	}

}
