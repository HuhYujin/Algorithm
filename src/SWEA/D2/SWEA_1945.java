package SWEA.D2;

import java.util.Scanner;

public class SWEA_1945 {

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

			int n=sc.nextInt();
			
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			
			while(n!=1) {
				if(n%2==0) {
					a++;
					n=n/2;
				}else if(n%3==0) {
					b++;
					n/=3;
				}else if(n%5==0) {
					c++;
					n/=5;
				}else if(n%7==0) {
					d++;
					n/=7;
				}else if(n%11==0) {
					e++;
					n/=11;
				}
			}
			System.out.println("#"+test_case+" "+a+" "+b+" "+c+" "+d+" "+e);
			
		}//end test_case
		
		sc.close();
	}//end main

}
