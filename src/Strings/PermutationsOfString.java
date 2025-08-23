package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsOfString {
	
	List<String> sol = new ArrayList<String>();
	Set<String> s = new HashSet<String>();
	
	public List<String> findPermutation(String str){
		permutation(str, "");
		for(String temp : s) {
			sol.add(temp);
		}
		Collections.sort(sol);
		return sol;
	}
	
	public void permutation(String input, String output) {
		if(input.length()==0) {
			s.add(output);
			return;
		}
		
		char ch [] = input.toCharArray();
		
		for(int i=0; i< ch.length; i++) {
			String remain = input.substring(0,i)+input.substring(i+1);
			permutation(remain, output+ch[i]);
		}
	}
	
	public static void main(String[] args) {
		
		PermutationsOfString pos = new PermutationsOfString();
		System.out.println(pos.findPermutation("abc"));
		
	}
}
