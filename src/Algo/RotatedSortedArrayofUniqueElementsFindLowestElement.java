package Algo;

public class RotatedSortedArrayofUniqueElementsFindLowestElement {

	public static void main(String[] args) {
		
		//Find the lowest element
		
		int [] nums = {6,7,-2,0,1,2,4};
		int lb = 0;
		int rb = nums.length-1;
		
		while(rb>lb) {
			
			int mid = (rb+lb)/2;
			
			if(nums[mid]>nums[rb]) {
				lb=mid+1;
			}
			else {
				rb=mid;
			}
		}
		System.out.println(nums[lb]);
		
	}

}
