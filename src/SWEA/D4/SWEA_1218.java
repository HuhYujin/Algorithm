package SWEA.D4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n=sc.nextInt(); //testcase의 길이
			String s = sc.next();
			int result=0;
			Stack<Character> st=new Stack<>();
			
			for(int i = 0; i < n; i++) {
				char c = s.charAt(i);
				
				if(c == ')' && st.peek() == '(') st.pop();
				else if(c == ']' && st.peek() == '[') st.pop();
				else if(c == '}' && st.peek() == '{') st.pop();
				else if(c == '>' && st.peek() == '<') st.pop();
				else {
					st.push(c);
				}
			}
			if(st.isEmpty()) result = 1;
			else result = 0;
			System.out.println("#" + test_case + " " + result);		
			
			


		}//end test_case
		
		sc.close();
	}//end main

}
