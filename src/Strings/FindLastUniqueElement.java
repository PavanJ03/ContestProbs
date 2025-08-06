package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindLastUniqueElement {
	
	public static void main(String[] args) {
		//Use Map to count the repeating chars
		//Use Set to store the unique values parallelly
		//Add the Set values to List
		//Reverse the List using Collections class methods
		//Check map keys value is equal to 1, if yes, print it
		
        String str = "forgeeksfor";
        char[] ch = str.toLowerCase().toCharArray();
        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
        Set<Character> s = new LinkedHashSet<Character>();
        for(char newCh : ch){
            if(!m.containsKey(newCh)){
                m.put(newCh, 1);
            }
            else{
                m.put(newCh, m.get(newCh)+1);
            }
            s.add(newCh);
        }
        
        System.out.println(m);
        System.out.println(s);
        
        List<Character> ls = new ArrayList<Character>(s);
        Collections.reverse(ls);
        System.out.println(ls);
        
        for(char c : ls) {
        	if(m.get(c)==1) {
        		System.out.println(c);
        		break;
        	}
        	
        }
      
    }
}
