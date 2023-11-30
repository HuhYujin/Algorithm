package SWEA.D3;

import java.util.Scanner;

public class SWEA_1289 {

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

			String data=sc.next();
			int[] dataArr=new int[data.length()];
			int cnt=0;
			for (int i = 0; i < data.length(); i++) {
				//문자를 숫자로 변환하기위해 ascii값을 땐다. 
				//0의 아스키는 48임. 그래서 1의 아스키는 49니까 49-48은 숫자1이된다.
                if (dataArr[i] != (data.charAt(i) - '0')) {
                    // 메모리 값과 초기화된 값이 다르면 cnt 증가
                    cnt++;
                    if (dataArr[i] == 0) {
                        // 0이면 1로 바꾸기
                        for (int j = i; j < data.length(); j++) {
                            dataArr[j] = 1;
                        }
                    } else {
                        // 1이면 0으로 바꾸기
                        for (int j = i; j < data.length(); j++) {
                            dataArr[j] = 0;
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + cnt);

			
		}//end test_case
		
		sc.close();
	}//end main

}
