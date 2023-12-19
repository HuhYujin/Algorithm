package SWEA.D4;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1223 {

	public static void main(String[] args) {

		/*
		 * 곱하기와 더하기가 있는 후위표기식
		 * 
		 * 후위표기식으로만들기; 
		 * 숫자면 식에 그대로 넣는다. 
		 * *이면 연산자 스택에 넣는다
		 * +이면 연산자 스택이 빌때까지 스택에서 연산자를 뽑아 식에 넣은후 자기자신을 스택에 넣는다. 
		 * 
		 * 
		 * 후위표기식 계산하기
		 * 숫자라면 계산스택에 넣는다. 
		 * 연산자라면 계산스택에서 맨위의 두 숫자를 꺼낸후 연산한다. 연산한 결과는 다시 스택에 넣는다. 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{

			//후위표기식; 컴퓨터가 계산하기 쉽게 피연산자 뒤에 연산자를 넣은 식
			//스택으로 계산한다
			int n=sc.nextInt(); //문자열 계싼식의 길이
			String inputS= sc.next();
			//후위표기식 전환하는 메서드사용
			String postfixString=makePostix(inputS);
			//후위표기식을 계산하는 메서드 사용
			int result=calPostfix(postfixString);
			System.out.println("#"+test_case+" "+result);
			
			
	
		}//end test_case
		
		sc.close();
	}//end main
	
	//중위표기식을 후위표기식으로 변환해주는 메서드
	public static String makePostix(String infix) {
		StringBuilder postfix=new StringBuilder(); //후위표기식
		Stack<Character> stack=new Stack<>(); //연산자 스택
		
		for(char ch:infix.toCharArray()) {
			if(Character.isDigit(ch)) {
				postfix.append(ch);
			}else if(ch=='*' || ch=='+') {

				//현재 연산자가 스택의 top에 있는 연산자보다 우선순위가 낮으면 pop후에 현재 연산자 push
				while (!stack.isEmpty() && getPriority(ch) <= getPriority(stack.peek()))
					postfix.append(stack.pop());
			}
			stack.push(ch);
			
		}
		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}

	
	//후위 표기식을 계산하는 메소드
	public static int calPostfix(String postfix) {
		Stack<Integer> stack =new Stack<>(); //계산스택
		for(char ch:postfix.toCharArray()) {
			if(Character.isDigit(ch)) {
				stack.push(Character.getNumericValue(ch)); //char를 숫자로 변환해서 저장
	        } else if (ch == '+') {
	            int aa = stack.pop();
	            int bb = stack.pop();
	            stack.push(bb + aa);
	        } else if (ch == '*') {
	            int aa = stack.pop();
	            int bb = stack.pop();
	            stack.push(aa * bb); 
	        }
		}
		return stack.pop();
		
	}
	
	//연산자 우선순위 반환 메서드
	public static int getPriority(char operator) {
		if(operator =='*') {
			return 2; 
		}else if(operator == '+') {
			return 1;
		}
		return 0; //피연산자면 0
	}
}
