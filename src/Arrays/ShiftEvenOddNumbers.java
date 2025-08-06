package Arrays;

import java.util.Arrays;

public class ShiftEvenOddNumbers {
	public static void main(String[] args) {
		//Use 2 pointer - get lb and rb
		//check if lb is odd and rb is even --> swap it
		//check if lb is odd and rb is also odd --> decrement rb
		//check if lb is even and rb is odd --> increament lb
		int[] arr = {33, 5, 75, 25, 60, 4, 13, 12, 99, 13568};
		int lb = 0;
		int rb = arr.length-1;
		while(rb>=lb) {
			boolean checklb = arr[lb]%2==1;//check odd
			boolean checkrb = arr[rb]%2==0;//check even
			
			if(checklb && checkrb) {
				int temp = arr[lb];
				arr[lb] = arr[rb];
				arr[rb] = temp;
				lb++;
				rb--;
			}
			else if(checklb) {
				rb--;
			}
			else {
				lb++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
