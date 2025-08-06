package Strings;

public class ReverseStringAndPreserveNumbers {

	public static void main(String[] args) {
		
		String str = "My Name is123 Pavan";
		char [] ch = str.toCharArray();
		int lb = 0;
		int rb = ch.length-1;
		
		while(rb>=lb) {
			if(Character.isDigit(ch[lb])) {
				lb++;
			}
			else if(Character.isDigit(ch[rb])) {
				rb--;
			}
			else {
				char temp = ch[lb];
				ch[lb] = ch[rb];
				ch[rb] = temp;
				lb++;
				rb--;
				
			}
		}
		System.out.println(String.valueOf(ch));
		
		
	}
}
