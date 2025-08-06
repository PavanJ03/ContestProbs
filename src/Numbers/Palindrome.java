package Numbers;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 52425;
		int temp = num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
