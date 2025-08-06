package Arrays;

import java.util.Arrays;

public class BoubleSort_ReverseArrayDSC {
	
	public static void main(String[] args) {
		
		int a[] = {32, -2, -4, 77, 7, 3, -32, 77, -0};
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		//traverse through the array
		//take first element and compare with rest of the element one by one
		//In first iteration - first element will be lowest element
		//if element1 < element2 swap it
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i; j<a.length-1; j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
		System.out.println("Output : "+Arrays.toString(a));
	}
}
