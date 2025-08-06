package Strings;

public class RemoveUnwantedSpaceBetweenStrings {

	public static void main(String[] args) {
		
		
		//store string in a char array
		//traverse through the char array
		//take first char from array and compare it with previous char
		//current char is not equal to space or not equals to previous char
		//store it as a string
		//assign current char as prev char
	
		String str = "   I  Love Programmmmming   lang     .";
		char [] arrch = str.trim().toCharArray();
		char prev = ' ';
		String output = "";
		for(int i=0;i <arrch.length;i++) {
			
			char cur = arrch[i];
			
			if(cur!= prev || cur!=' ') {
				output+=cur;
			}
			prev = cur;
		}
		System.out.println(output);
	}
	

}
