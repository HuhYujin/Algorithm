package SWEA.D4;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1211 {

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
			
			//첫번째줄에서 1로시작하는애들 전부 사다리타기한후 최단거리의 좌표를 구해야함.
			int minCol=0;//최단거리를 가진 x값
			int minScore=Integer.MAX_VALUE; //최단거리
					
			for(int i=0; i<100;i++) {
				int currscore=0; //현재거리
				int currCol = i; //현재 열번호
				
				if(arr[0][i]==1) {
					
					//위에서부터 사다리 타고 내려가면서 거리구하기
					for(int row=1;row<100;row++) {
						
						if(currCol-1>=0 && arr[row][currCol-1]==1) {
							while(currCol-1>=0 && arr[row][currCol-1]==1) {
								currCol-=1;
								currscore++;
							}
						}else if(currCol+1<100 && arr[row][currCol+1]==1) {
							while(currCol+1<100 && arr[row][currCol+1]==1) {
								currCol+=1;
								currscore++;
							}
						}
						currscore++;
					}	
					
					//최단거리인지 확인하고 저장하기
					if(currscore<=minScore) {
						minScore=currscore;
						minCol=i;
					}
					
				}	
				
			}
			
			
			System.out.println("#"+test_case+" "+minCol);


		}//end test_case
		
		sc.close();
	}//end main

}
