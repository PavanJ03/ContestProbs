package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		//change the given string to char array
		//add all the chars to set collection to store only the unique chars from array
		//get each char element from set and append it to stringbuilder
		
		String str = "Learning Java Programming . ";
		str = str.toLowerCase().replaceAll("\\s", "");
		char [] ch = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(char c : ch) {
			set.add(c);
		}
		
		//System.out.println(set);
		StringBuilder builder = new StringBuilder();
		for(char c : set) {
			builder.append(c);
		}
		System.out.println(builder);
		
	}
	
	
}
