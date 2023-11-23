package SWEA.D2;

import java.util.Base64;
import java.util.Scanner;

public class SWEA_1928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{

			String encode=sc.next();
			String decode=new String(Base64.getDecoder().decode(encode));
			
			
			System.out.println("#"+test_case+" "+decode);
			
		}//end test_case
		
		sc.close();
	}//end main

}
