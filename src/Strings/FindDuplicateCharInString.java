package Strings;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "Naveen Automation";
		char [] ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character = "+ch[i]);
					
				}
			}
			
		}
		
	}
}