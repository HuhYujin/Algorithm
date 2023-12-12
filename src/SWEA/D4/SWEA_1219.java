package SWEA.D4;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1219 {
	static int result;
	static int[] arr1;
	static int[] arr2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			//케이스 번호
			int tc=sc.nextInt();
			//테스트 길이 (순서쌍 갯수)
			int n=sc.nextInt();
			//순서쌍 입력받기
			arr1=new int[100];
			arr2=new int[100];

			result=0; //결과. 없으면0 있으면1
			
			for(int i=0;i<n;i++) {
				int aa=sc.nextInt(); //순서쌍에서 출발쪽
				int bb=sc.nextInt(); //순서쌍에서 도착쪽
				
				if(arr1[aa]==0) {
					arr1[aa]=bb;
				}else {
					arr2[aa]=bb;
				}
			}
			findRoute(arr1[0]);
			findRoute(arr2[0]);
			
			System.out.println("#"+test_case+" "+result);
		}//end test_case
		
		sc.close();
	}//end main
	
	
	public static void findRoute(int i) {
		if(i==99) {
			result=1;
			return;
		}
		if(i==0) {
			return;
		}
		if(result==1) {
			return;
		}
		findRoute(arr1[i]);
		findRoute(arr2[i]);
	}//end findRoute()

}
