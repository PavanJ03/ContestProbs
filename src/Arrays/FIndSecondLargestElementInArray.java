package Arrays;

import java.util.Arrays;

public class FIndSecondLargestElementInArray {

	public static void main(String[] args) {
		
		int [] arr = {1,9,11,9,8,10,10,8,10,11,11,10,10,11};
        int size = arr.length;
        if(size<1){
            System.out.println("Array is empty");
            return;
        }
        else if(size<2){
            System.out.println("Array has only one element. Cant find second largest element");
            return;
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int highest = arr[size-1];
        for(int i=size-1; i>=0; i--){
        	if(arr[i]<highest) {
        		System.out.println("Second Largest Element = " + arr[i]);
            	return;
        	}
        }
	}
}
