package SWEA.D2;

import java.util.Scanner;

public class SWEA_2001 {

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

			int n=sc.nextInt();//배열크기
			int m=sc.nextInt();//파리채크기
			
			int[][] arr=new int[n][n];//배열
			//배열에 값 저장하기
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			//최대파리채점수
			int max=0;
			
			//파리채값 구하기
			//n-m인거는 파리채가 배열을 넘어가면 안되니까 최대시작점이 n-m이 되는것
			for(int i=0;i<=n-m;i++) {
				for(int j=0;j<=n-m;j++) {
					int sum=0;//파리채점수
					
					//파리채 반복문
					for(int a=0;a<m;a++) {
						for(int b=0;b<m;b++) {
							sum+=arr[i+a][j+b];
						}
					}
					
					if(max<sum) {
						max=sum;
					}
				}
			}
			System.out.println("#"+test_case+" "+max);
			
			

			
		}//end test_case
		
		sc.close();
	}//end main

}
