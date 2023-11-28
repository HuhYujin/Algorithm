package SWEA.D3;

import java.util.Scanner;

public class SWEA_1206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{

			int n=sc.nextInt(); //n개의 건물수
			int[] arr=new int[n];//건물 배열
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			//조망계산
			int cnt=0;
			for(int i=2;i<n-2;i++) {//전체 건물 하나씩
				int maxLeft=Math.max(arr[i-2], arr[i-1]);
				int maxRight=Math.max(arr[i+1], arr[i+2]);

				int maxAll=Math.max(maxLeft, maxRight);
				if(arr[i]>maxAll) {
					cnt+=arr[i]-maxAll;
				}
				
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}//end test_case
		
		sc.close();
	}//end main

}
