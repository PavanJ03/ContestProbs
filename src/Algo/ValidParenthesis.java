package Algo;

import java.util.Stack;

public class ValidParenthesis {

	boolean validParanthesis(String str) {
		char [] ch = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for(char temp : ch) {
			if(temp == '{') {
				stack.push('}');
			}
			else if(temp == '[') {
				stack.push(']');
			}
			else if(temp == '(') {
				stack.push(')');
			}
			else if(stack.isEmpty() || stack.pop()!=temp) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		ValidParenthesis vp = new  ValidParenthesis();
		System.out.println(vp.validParanthesis("{[]}()"));
		System.out.println(vp.validParanthesis("{[]}(>)"));

	}

}
