package Strings;

public class RemoveSpaceBetweenStrings {

	public static void main(String[] args) {
		
		String str = "   Java   is a  programming language    . ";
		//regular expression
		str = str.replaceAll("\\s+", "");
		//straight forward using replace()
		//str = str.replace(" ", "");
		System.out.println(str);
		
	}

}
