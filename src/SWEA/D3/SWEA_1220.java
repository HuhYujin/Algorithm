package SWEA.D3;

import java.util.Scanner;

public class SWEA_1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n=sc.nextInt(); //테이블 한변의 길이 (항상100임)
			//테이블
			int[][] table=new int[100][100];
			for(int i=0; i<n;i++) {
				for(int j=0; j<n;j++) {
					
					table[i][j]=sc.nextInt();
				}
			}
			
			int cnt=0; //교착상태인 자석 카운트
			
			for(int i=0; i<n;i++) {
				int before=0; //이전 자석의 극
				for(int j=0; j<n;j++) {
					if(table[j][i]==1) {
						before=1;
					}else if(table[j][i]==2) {
						if(before==1) {
							cnt++;
						}
						before=2;
					}
					
					
				}
				

			}
			System.out.println("#"+test_case+" "+cnt);
			
			

		}//end test_case
		
		sc.close();
	}//end main

}
