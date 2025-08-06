package Algo;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = " Hello  I am the   World ";
		String[] strarr = s.split(" +");
		StringBuilder sb = new StringBuilder();
		for(int i =strarr.length-1; i>=0; i--) {
			sb.append(strarr[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
