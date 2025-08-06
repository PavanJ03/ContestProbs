package Algo;

import java.util.Arrays;
import java.util.List;

public class SlidingWindow {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(7,3,5,6);
		List <Integer> binary = Arrays.asList(1,0,0,0);
		int max = 0;
		int k=2;
		for(int i=0; i<k;i++) {
			if(binary.get(i)==1)
				max+=list.get(i);
			
		}

		System.out.println(max);
		int maxSum = max;
		
		for(int i=k; i<list.size(); i++){
			max+=list.get(i);
			max-=list.get(i-k);
			maxSum = Math.max(maxSum, max);
		}
		System.out.println(maxSum);
	}

}
