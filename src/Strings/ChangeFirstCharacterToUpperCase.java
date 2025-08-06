package Strings;

public class ChangeFirstCharacterToUpperCase {

	public static void main(String[] args) {
		
		String str = "learning java";
		char [] ch = str.toCharArray();
		for(int i=0;i<1;i++) {
			ch[i] = Character.toUpperCase(ch[i]);
		}

		System.out.println(ch);
	}

}
