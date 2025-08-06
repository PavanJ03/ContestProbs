package Strings;

public class ReverseStringAndPreserveSpaces {

	public static void main(String[] args) {
		//Take 2 char arrays one for storing string as char array and another for storing reversed string as char array
		//Write the logic to preserve the space first in output
		//get the index of last element by using length method
		//traverse through the input arr and check if char != space
		//Add the char to output arr
		//decrement index value
		//add onemore condition to decrement index when output arr is already having space
		
		String str = "Learning Java Programming .";
		
		char [] input = str.toCharArray();
		char [] result = new char[input.length];
		
		for(int i=0; i<input.length;i++) {
			if(input[i]==' ') {
				result[i]=' ';
			}
		}
		
		int j = input.length-1;
		for(int i=0; i<input.length;i++) {
			if(input[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}
				result[j] = input[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

}
