package SWEA.D3;

import java.util.Scanner;

public class SWEA_12368 {

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

			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int time=(a+b)%24;
			System.out.println("#"+test_case+" "+time);

			
		}//end test_case
		
		sc.close();
	}//end main

}
