package SWEA.D3;

import java.util.Scanner;

public class SWEA_10505 {

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
			int n=sc.nextInt();//n명
			int[] money=new int[n];//소득 배열
			int sum=0;//총합
			
			for(int i=0;i<n;i++) {
				money[i]=sc.nextInt();
				sum+=money[i];
			}
			double avg=sum/(double)n;//소수점 표시위해 double
			int cnt=0;//평균소득보다 적은 사람 카운트
			
			for(int m:money) {
				if(m<=avg) {
					cnt++;
				}
			}
			System.out.println("#"+test_case+" "+cnt);
			
			
		}//end test_case
		
		sc.close();
	}//end main

}
