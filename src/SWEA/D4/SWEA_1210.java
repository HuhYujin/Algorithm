package SWEA.D4;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			//케이스 번호
			int tc=sc.nextInt();
			
			//배열
			int[][] arr=new int[100][100];
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			
			/*
			 * 제일 밑에서부터 올라가는 형태로 정답을 찾을거임. 
			 */
			
			//도착지점인 2를 찾기. 
			int goalCol=0;
			for(int i=0;i<100;i++) {
				if(arr[99][i]==2) {
					goalCol=i;
					break;
				}
			}
			
			//밑에서부터 사다리 타고 올라가기
			int currCol=goalCol;

			
			for(int row=99;row>=0;row--) {
				if(currCol-1>=0  && arr[row][currCol-1]==1) {
					while(currCol-1>=0 && arr[row][currCol-1]==1) {
						currCol-=1;
					}
				}else if(currCol+1<100  && arr[row][currCol+1]==1) {
					while(currCol+1<100 && arr[row][currCol+1]==1) {
						currCol+=1;
					}
				}
				
			}

			
			
			System.out.println("#"+test_case+" "+currCol);
			
			
		}//end test_case
		
		sc.close();
	}//end main

}
