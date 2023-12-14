package SWEA.D3;

import java.util.Scanner;

public class SWEA_1216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		   회문2 문제
		   100*100 글자판에서 가로세로를 보아 가장 긴 회문의 길이를 구하는 문제. 
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{

			int tc=sc.nextInt();
			char[][] arr=new char[100][100]; //글자 배열
			for(int i=0;i<100;i++) {
				String s=sc.next();
				for(int j=0;j<100;j++) {
					arr[i][j]=s.charAt(j);
				}
			}

 
			int result=0;
			
			
			//가로
			for(int s=100;s>0;s--) { // 회문길이 100부터 좁히기 
				int cnt = s+1;
				for(int i=0;i<100;i++) {
					for(int j=0;j<100;j++) {
						boolean flag = false;
						for(int k=0;k<cnt/2;k++) { 
							if((j+k)>=100 || (j+s-k)>=100) { //배열초과시 true로 바꿔주고 반복문 빠져나감
								flag=true;
								break;
							}
							if(arr[i][j+k]!=arr[i][j+s-k]) { //회문여부 확인
								flag=true;
							}
						}
						if(!flag) {
							if(result<cnt)
								result=cnt;
						}
					}
				}
			}
			
			//세로
			for(int s=100;s>0;s--) { // 회문길이 100부터 좁히기
				int cnt = s+1;
				for(int i=0;i<100;i++) {
					for(int j=0;j<100;j++) {
						boolean flag = false;
						for(int k=0;k<cnt/2;k++) {
							if((j+k)>=100 || (j+s-k)>=100){
								flag=true;
								break;
							}
							if(arr[j+k][i]!=arr[j+s-k][i]) {
								flag=true;
							}
						}
						if(!flag) {
							if(result<cnt)
								result=cnt;
						}
					}
				}
			}
		
			
			
			System.out.println("#"+test_case+" "+result);
			
		}//end test_case
		
		sc.close();
	}//end main

}
