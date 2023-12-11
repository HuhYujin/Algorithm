package SWEA.D3;

import java.util.Scanner;

public class SWEA_1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tc=sc.nextInt();
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			System.out.println("#"+test_case+" "+cal(n,m));
		}//end test_case
		
		sc.close();
	}//end main
	
	public static int cal(int n, int m) {
		if(m==1) {
			return n;
		}
		return n*cal(n,m-1);
	}

}
