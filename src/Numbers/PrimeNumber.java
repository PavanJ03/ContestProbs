package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to check for Prime Number");
		int num =sc.nextInt();
		
		int temp = num;//17
		int count = 0;
		for(int i=2; i<=temp; i++) {
			if(temp%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}

}
