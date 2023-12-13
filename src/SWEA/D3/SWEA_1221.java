package SWEA.D3;

import java.util.Scanner;


public class SWEA_1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();//엔터 소비
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */
		String[] numStr = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

		for (int test_case = 1; test_case <= T; test_case++) {

			String a=sc.nextLine();
				String[] b=a.split(" ");
				int no=Integer.parseInt(b[1]); //tc의 길이
				
				//배열 입력받기
				String input=sc.nextLine();
				String[] arr=input.split(" ");
				
				System.out.println("#"+test_case);
				for(int i=0; i<10;i++) {
					for(int j=0;j<no;j++) {
						if(arr[j].equals(numStr[i])) {
							System.out.printf(arr[j]+" ");
						}
					}
				}
				
			
		} // end test_case

		sc.close();
	}// end main

}
