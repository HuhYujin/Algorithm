package SWEA.D3;

import java.util.Scanner;

public class SWEA_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{

			int n=Integer.parseInt(sc.nextLine());
			String[][] arr=new String[8][8]; //글자 배열
			for(int i=0;i<8;i++) {
				arr[i]=sc.nextLine().split("");
			}
	
			int cnt=0; //회문 갯수
			//회문확인하기
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					//가로부터
					if(j+n<=8) {//범위 안넘어가게 설정
						boolean flag=true;
						for(int x=0; x<n/2;x++) {
							if(!arr[i][j+x].equals(arr[i][j+n-1-x])) {
								flag=false; //다를경우 플래그 false로 하고 break
								break;
							}
						}
						if(flag)cnt++; //true인경우에 카운팅
					}
					//세로찾기
					if(i+n<=8) {
						boolean flag=true;
						for(int x=0; x<n/2;x++) {
							if(!arr[i+x][j].equals(arr[i+n-1-x][j])) {
								flag=false;
								break;
							}
						}
						if(flag)cnt++;
					}
				}
			}
			System.out.println("#"+test_case+" "+cnt);
			

		}//end test_case
		
		sc.close();
	}//end main

}
