package SWEA.D2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SWEA_1288 {

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
			int n=sc.nextInt(); //xN에서의 N
			Set<String> set=new HashSet<String>();//중복허용x인 set이용
			int x=1; //xN 에서의 x
			int num=0; 
			while(set.size()<10) {
				num=x*n;
				String[] str=Integer.toString(num).split("");//한글자씩 나눠서
				for(String s:str) {
					set.add(s);//set에 저장
				}
				x++;
			}
			System.out.println("#"+test_case+" "+num);

			
		}//end test_case
		
		sc.close();
	}//end main

}
