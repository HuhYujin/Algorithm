package SWEA.D1;

import java.util.Scanner;

public class SWEA_2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int total=0;
			
			for(int i=0; i<10;i++) {
				int num=sc.nextInt();
				total+=num;
			}
			int avg=(int) Math.round((double)total/10) ;
			
			System.out.println("#"+test_case+" "+avg);
		}
	}//end main

}
