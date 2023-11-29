package SWEA.D3;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int dump=sc.nextInt();
			int[] arr=new int[100];
			for (int i=0;i<100;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<dump;i++) {
				Arrays.sort(arr);//정렬
				arr[0]++;
				arr[99]--;
			}
			Arrays.sort(arr);
			int result=arr[99]-arr[0];
			System.out.println("#"+test_case+" "+result);
			
		}//end test_case
		
		sc.close();
	}//end main

}
