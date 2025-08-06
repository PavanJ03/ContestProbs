package Algo;

public class RotatedSortedArrayofUniqueElementsFindTarget {

	public static void main(String[] args) {
		
		//Find the target element
		int target = 7;
		int [] nums = {6,7,-2,0,1,2,4};
		int lb = 0;
		int rb = nums.length-1;
		while(rb>=lb) {
			int mid = (lb+rb)/2;
			if(nums[mid]==target) {
				System.out.println(mid);
			}
			
			if(nums[lb]<nums[mid]) {
				if(nums[lb]<=target && nums[mid]>target) {
					rb=mid-1;
				}
				else {
					lb=mid+1;
				}
			}
			else {
				if(nums[mid]<target && nums[rb]>=target) {
					lb=mid+1;
				}
				else {
					rb=mid-1;
				}
			}
		}
	}
}
