package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "WeleeeW";
		String str1 = str;
		char [] ch = str.toCharArray();
		int lb = 0;
		int rb = str.length()-1;
		
		while(rb>=lb) {
			char temp = ch[lb];
			ch[lb]=ch[rb];
			//System.out.println(ch);
			ch[rb]=temp;
			lb++;
			rb--;
		}
		
		if(str1.equalsIgnoreCase(String.valueOf(ch))) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
