package SWEA.D3;

import java.util.Scanner;

public class SWEA_3431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{

            int L=sc.nextInt();
            int U=sc.nextInt();
            int x=sc.nextInt();
            
            if(x>U){
            	System.out.println("#"+test_case+" "+"-1");
            }else if(x<L){
                int more=L-x;
            	System.out.println("#"+test_case+" "+more);
            }else{
                System.out.println("#"+test_case+" "+0);
            }    
			

			
		}//end test_case
		
		sc.close();
	}//end main

}
