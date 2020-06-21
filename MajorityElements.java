package pratice;
import java.util.Arrays; 

	//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
	//You may assume that the array is non-empty and the majority element always exist in the array.

	/*
	Input: [3,2,3] 
	Output: 3
	*/
	//[2,3,3] 
	

	public class MajorityElements {
	 public int majorityElement(int[] nums){
	   Arrays.sort(nums); // runtime: n log n
	   return nums[nums.length/2]; //if u divide the array by 2 u will find the majority element repeated

	 }
	
}
