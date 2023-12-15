package SWEA.D4;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1222 {

	public static void main(String[] args) {

		/*
		 * 4+5+6+7 을 후위계산식 45+6+7+ 로 계산해서 답을 출력해라
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
			
			
			/*
			 *후위표기식이 뭔지 몰라서 그냥 진짜 45+6+7 인줄알고 처음에 만든코드
			 
			int n=sc.nextInt(); //문자열 계싼식의 길이
			String inputS= sc.next();
			String[] arr=inputS.split("");
			
			int oneTwo=Integer.parseInt(arr[0]+arr[2]);
			
			for(int i=4;i<n;i++) { //어짜피 4부터 숫자 나오니까 
				if(!arr[i].equals("+")) {
					oneTwo+= Integer.parseInt(arr[i]);
				}
				
			}
			System.out.println("#"+test_case+" "+oneTwo);
			*/

		}//end test_case
		
		sc.close();
	}//end main
	
	//중위표기식을 후위표기식으로 변환해주는 메서드
	public static String makePostix(String infix) {
		StringBuilder postfix=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		
		for(char ch:infix.toCharArray()) {
			if(Character.isDigit(ch)) {
				postfix.append(ch);
			}else if(ch=='+') {
				while(!stack.isEmpty()&&stack.peek()=='+') {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		
		return postfix.toString();
	}

	
	//후위 표기식을 계산하는 메소드
	public static int calPostfix(String postfix) {
		Stack<Integer> stack =new Stack<>();
		for(char ch:postfix.toCharArray()) {
			if(Character.isDigit(ch)) {
				stack.push(Character.getNumericValue(ch)); //char를 숫자로 변환해서 저장
			}else if( ch=='+') {
				int aa= stack.pop();
				int bb=stack.pop();
				stack.push(aa+bb);
			}
			
		}
		return stack.pop();
		
	}
}
