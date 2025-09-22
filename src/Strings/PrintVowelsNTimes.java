package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintVowelsNTimes {

	//Add vowels and its count to map
	//Split string using spaces and put it in a String array
	//Traverse through array and pass each word along with map to function
	//Put String in char array and traverse
	//If map contains char then get value of char and update repeat count
	//use for loop to add duplicate vowels to StringBuilder
	//Else not vowel add the char to StringBuilder

	public static String updateVowels(String s, Map<Character, Integer> mapVowels) {
		StringBuilder sb = new StringBuilder();
		char [] ch = s.toCharArray();
		for(char temp : ch){
			if(mapVowels.containsKey(temp)) {
				int repeat = mapVowels.get(temp);
				for(int i =0; i< repeat; i++) {
					sb.append(temp);
				}
			}
			else {
				sb.append(temp);
			}
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		String str = "Apple tree win";
		str = str.toLowerCase();
		StringBuilder result = new StringBuilder();
		Map<Character, Integer> mapVowels = new HashMap<Character, Integer>();
		mapVowels.put('a', 1);
		mapVowels.put('e', 2);
		mapVowels.put('i', 3);
		mapVowels.put('o', 4);
		mapVowels.put('u', 5);

		String [] arr = str.split(" ");
		
		for(String temp : arr) {
			result.append(updateVowels(temp, mapVowels));
			result.append(" ");
		}
		System.out.println(result);

}

}
