package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstUniqueElement {

	public static void main(String[] args) {
		
		
//		//"wweeyufgttmdsggg"
//		 
//		first character in the string which does not repeat.
		
		String str = "wweeyufgttmdsggg";
		
		char [] ch = str.toCharArray();
		
		Map<Character, Integer> mapOfChar = new LinkedHashMap<>();
		for(char newCh : ch) {
			if(!(mapOfChar.containsKey(newCh))) {
				mapOfChar.put(newCh, 1);
			}
			else {
				mapOfChar.put(newCh, mapOfChar.get(newCh)+1);
			}
		}
		
		Set<Character> setOfChar = mapOfChar.keySet();
		for(char tempChar : setOfChar) {
			if(mapOfChar.get(tempChar)==1) {
				System.out.println("First Unique Character : "+ tempChar);
				break;
			}
		}

	}

}
