package Strings;

import java.util.Arrays;

public class CheckStringIsAnagram {

	public static void main(String[] args) {
		//remove spaces from 2 strings and convert it into char array
		//sort the char arrays
		//if length of arr1 != arr2 return false
		//then compare 2 arrays using equals method from Arrays class
		
		String str1 ="Li sten  .";
		String str2 ="  Sil  enT  .";
		str1 = str1.toLowerCase().replaceAll("\\s", "");
		str2 = str2.toLowerCase().replaceAll("\\s", "");

		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length != ch2.length) {
			System.out.println("Not an Anagram");
		}
		else if (Arrays.equals(ch1, ch2)) {
			System.out.println("Yes, It is an Anagram");
		}
	}

}
