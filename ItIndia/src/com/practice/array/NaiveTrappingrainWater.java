package com.practice.array;

public class NaiveTrappingrainWater {

	//2nd max elment-traverse a0 to ai-1,fix larg=0 and sec=-1 index-compare
	//1.arr[i]>arr[lrg]-lrg=i,seclrg=larg
	//2.arr[i]==arr[lrg]-ignore
	//3.arr[i]<arr[larg]-a)never seclarg exist, res=-1,res=i &b)arr[i]<arr[seclrg]-ignore &c)arr[i]>arr[seclrg],res=i
	
	
	public static void main(String[] args) {
		int arr[]= {3,0,1,2,5};
//trapping rain water	-at particular index, we caculte leftmax and rightmax and tal min of theese and subtract to array
		//corner caes- array acendening or decing order sort then 0 area
		int res=0;
		for(int i=1;i<arr.length-1;i++) {
			int leftmax=arr[i];
			for(int j=0;j<i;j++) {
				leftmax=Math.max(arr[j],leftmax);
			}
			int rightmax=arr[arr.length-1];
			for(int j=i+1;j<arr.length;j++) {
				rightmax=Math.max(rightmax, j);
				
			}
			res=res+Math.min(leftmax, rightmax)-arr[i];
		}
		System.out.println("area "+res);
	}

}
