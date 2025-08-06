package Arrays;

public class EquilibriumIndexOfArray {

	public static void main(String[] args) {
		
		int arr[] = {3,1,5,2,2};
		int totalSum= 0;
		int rightSum=0;
		int leftSum = 0;
		
		for(int i =0; i<arr.length;i++) {
			totalSum += arr[i];
		}
		
		for(int i =0; i<arr.length;i++) {
			rightSum = totalSum - leftSum - arr[i];
			if(leftSum == rightSum) {
				System.out.println(arr[i]);
				return;
			}
			leftSum = leftSum+arr[i];
	}
		System.out.println("No such index");

}

}