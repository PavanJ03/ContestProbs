package Algo;

public class Sumof2Integer {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		while(b!=0) {
			int temp = (a&b)<<1;
			a = a^b;
			b=temp;
		}
		System.out.println(a);

	}

}
