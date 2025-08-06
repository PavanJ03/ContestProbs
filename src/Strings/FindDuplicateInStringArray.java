package Strings;

public class FindDuplicateInStringArray {

	public static void main(String[] args) {
		
		String [] str = {"Java", "Python", "Java", "Ruby", "C#", "React", "Python", "Ruby"};
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])){
					System.out.println(str[i]);
				}
				}
			}
		}
	}
