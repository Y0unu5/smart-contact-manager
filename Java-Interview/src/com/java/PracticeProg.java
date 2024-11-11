package com.java;

public class PracticeProg {
	
	static double avgSubArray(int[] arr, int k) {
		double currSum=0;
		for(int i=0; i<k; i++) {
			currSum += arr[i];
		}
		double maxSum= currSum;
		for(int i=k; i< arr.length; i++) {
			currSum += (arr[i]- arr[i-k]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum/k;
	}
	
	public static void main(String[] args) {
		 int[] num={1,12,-5,-6,50,3};
	        int k=4;
	        double res= avgSubArray(num, k);
	        System.out.println(res);
	}

}
