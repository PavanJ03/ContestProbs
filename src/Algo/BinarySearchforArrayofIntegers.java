package Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchforArrayofIntegers {

	public static void main(String[] args) {
		
		//Sort the given array first
		//take index of first and last element then calculate mid index
		//check if mid value is greater than find element --> move right bound to mid value
		//check if mid value is less than find element --> move left bound to mid value
		//check if value is equals to find element --> return the mid value
		
		int findelement = 99;
		int [] arr = {6, 4, 2, 9, 66, 44, 15, 69};
		Arrays.sort(arr);
		int lb = 0;
		int rb = arr.length-1;
		int mid;
		int flag = 0;
		while(rb>=lb) {
			mid = (lb+rb)/2;
			if(arr[mid]==findelement){
				System.out.println("found element at index = " + mid);
				flag = 1;
				break;
			}
			else if(arr[mid]>findelement) {
				rb= mid-1;
			}
			else if(arr[mid]<findelement) {
				lb= mid+1;
			}
			
		}
		if (flag==0) {
			System.out.println("no matching element");
		}
		
//		int findelement1 = 6;
//		int [] arr1 = {32, 2,42,5,6, 256, 7,-3,2,-66};
//		List<Integer> intlist = new ArrayList<>();
//		for(int i : arr) {
//			intlist.add(i);
//		}
//		Collections.sort(intlist);
//		
//		Object[] sortedarr = intlist.toArray();
		
//		for(int i =0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-1; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] =arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		
	}

	}
