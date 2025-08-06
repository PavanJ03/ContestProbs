package Algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchforArrayofStrings {

	public static void main(String[] args) {
		
		//Sort the given strarray first
		//take index of first and last element then calculate mid index
		//check if mid value is greater than find element --> move right bound to mid value
		//check if mid value is less than find element --> move left bound to mid value
		//check if value is equals to find element --> return the mid value
		
		String findelement = "Beans";
		String [] strarr = {"Apple", "Orange", "Strawberry", "Carrot", "Beans"};
		Arrays.sort(strarr);
		int lb = 0;
		int rb = strarr.length-1;
		int mid;
		int flag = 0;
		while(rb>=lb) {
			mid = (lb+rb)/2;
			if(strarr[mid].equalsIgnoreCase(findelement)){
				System.out.println("found element at index = " + mid + " Element Name : " +strarr[mid]);
				flag = 1;
				break;
			}
			else if(strarr[mid].compareTo(findelement)>0) {
				rb= mid-1;
			}
			else {
				lb= mid+1;
			}
			
		}
		if (flag==0) {
			System.out.println("no matching element");
		}
		
//		int findelement1 = 6;
//		int [] strarr1 = {32, 2,42,5,6, 256, 7,-3,2,-66};
//		List<Integer> intlist = new strarrayList<>();
//		for(int i : strarr) {
//			intlist.add(i);
//		}
//		Collections.sort(intlist);
//		
//		Object[] sortedstrarr = intlist.tostrarray();
		
//		for(int i =0; i<strarr.length; i++) {
//			for(int j=0; j<strarr.length-1; j++) {
//				if(strarr[j]>strarr[j+1]) {
//					int temp = strarr[j];
//					strarr[j] =strarr[j+1];
//					strarr[j+1] = temp;
//				}
//			}
//		}
//		System.out.println(strarrays.toString(strarr));

		
	}

	}
