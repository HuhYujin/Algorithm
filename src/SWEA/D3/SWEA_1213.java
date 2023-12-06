package SWEA.D3;

import java.util.Scanner;

public class SWEA_1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tc=sc.nextInt(); //현재 testcase 번호
			
			sc.nextLine();//개행문자(줄바꿈문자)없애기
			/*
			 * nextint는 개행문자(줄바꿈문자)입력 전까지만 받음.
			 * 따라서 개행문자는 아직 남아있다. 
			 * 개행문자를 없애기 위해서 sc.nextlint해준것임. 
			 */	
			String findText=sc.nextLine();//찾을 단어
			String sentence=sc.nextLine();//문장
			
			int cnt=0; //카운트
			//findText길이가 있으니까 그 뒷부분은 더이상 비교 안해도됨 그래서 뺀것
			 //length()는 0부터 시작이니까 <= 로 해준다. 
			for(int i=0; i<=sentence.length()-findText.length();i++) {
				if(sentence.substring(i,i+findText.length()).equals(findText)) {
					cnt++;
				}
			}
			System.out.println("#"+test_case+" "+cnt);
				
			
			
			
		}//end test_case
		
		sc.close();
	}//end main

}
