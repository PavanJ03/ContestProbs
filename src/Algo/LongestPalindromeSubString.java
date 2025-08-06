package Algo;

public class LongestPalindromeSubString {
	int startIndex;
	int maxLength;
	
	public String longestPalindromicSubString(String s) {
		
		if(s.length()<2){		//checks if string has only one character then return it
			return s;
		}
		
		for(int start = 0; start<s.length()-1; start++) { 
			expandRange(s, start, start);					//mid is of odd length
			expandRange(s, start, start+1);					//mid is of even length
		}
		return s.substring(startIndex, startIndex + maxLength);

		
	}
	
	public void expandRange(String str, int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)) {
			begin--;
			end++;
		}
		if(maxLength<end-begin-1) {
			startIndex = begin+1;
			maxLength = end-begin-1;
		}
	}
	
	public static void main(String[] args) {
		LongestPalindromeSubString lp = new LongestPalindromeSubString();
		System.out.println(lp.longestPalindromicSubString("abciecbad"));
	}
}
