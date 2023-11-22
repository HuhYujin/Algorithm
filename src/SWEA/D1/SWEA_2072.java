package SWEA.D1;

import java.util.Scanner;

public class SWEA_2072 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();

	        for (int test_case = 1; test_case <= T; test_case++) {
	            int sum = 0;

	            for (int i = 0; i < 10; i++) {
	                int num = sc.nextInt();
	                if (num % 2 == 1) {  // 홀수인 경우에만 더하기
	                    sum += num;
	                }
	            }

	            System.out.println("#" + test_case + " " + sum);
	        }

	        sc.close();
	}

}
