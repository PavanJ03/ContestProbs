package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharAndCountInString {

	public static void main(String[] args) {
		//change given string to char array
		//store all the char array elements in a hash map based on below conditions
		//if key is already present get the value and put the value back after incrementing the value
		//if key is not present in the map --> put the key(char) and value(count as 1)
		//to get the count of duplicate characters --> get the keys of the map as a SET using KeySet() method of map interface
		//using the keys from new set, get the values from map and check if its value is greater than 1
		
		String str = "Naveen Automation";
		char [] ch = str.toLowerCase().toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(char c : ch) {
			if(!(m.containsKey(c))) {
				m.put(c, 1);
			}
			else {
				int alrpresent = m.get(c);
				m.put(c, alrpresent+1);
			}
		}
		System.out.println(m);
		Set<Character> s = m.keySet();
		for(char c : s) {
			if(m.get(c)>1) {
				System.out.println("Character "+ "'" +c+ "'" + " repeating "+ m.get(c));
			}
		}
	}
}