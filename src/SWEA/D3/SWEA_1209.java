package SWEA.D3;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tc=sc.nextInt();//테스트케이스 번호
			int[][]arr=new int[100][100];
			
			int max=0;
			int sum=0;
			
			//배열
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			//가로 합
			for(int i=0;i<100;i++) {
				sum=0;//초기화
				for(int j=0;j<100;j++) {
					sum+=arr[i][j];
				}
				if(max<=sum) {
					max=sum;
				}
			}
			sum=0;
			
			//세로합
			for(int i=0;i<100;i++) {
				sum=0;
				for(int j=0;j<100;j++) {
					sum+=arr[j][i];
				}
				if(max<=sum) {
					max=sum;
				}
			}
			
			//오른쪽아래 대각선
			sum=0;
			for(int i=0;i<100;i++) {
				sum+=arr[i][i];
			}
			if(max<=sum) {
				max=sum;
			}
			
			//오른쪽 위 대각선
			sum=0;
			for(int i=0;i<100;i++) {
				sum+=arr[i][99-i];
			}
			if(max<=sum) {
				max=sum;
			}
			
			System.out.println("#"+tc+" "+max);
			
			
		}//end test_case
		
		sc.close();
	}//end main

}
