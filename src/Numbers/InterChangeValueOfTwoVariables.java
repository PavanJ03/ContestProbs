package Numbers;

public class InterChangeValueOfTwoVariables {

	public static void main(String[] args) {
		//swap Strings
		String str1 = "Water";
		String str2 = "Bottle";
		String temp = str1;
		str1 =str2;
		str2 = temp;
		System.out.println(str1+str2);
		
		//swap Numbers
		int a = 67;
		int b = 33;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a + "   " + b);
	}

}
