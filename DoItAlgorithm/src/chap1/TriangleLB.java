package chap1;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while(n <= 0); // 0보다 크면 반복문 종료
		 
		for(int i = 1; i <= n; i++) { // 세로방향 반복
			for(int j = 1; j <= i; j++) // 가로방향 반복(단 별로 i만큼 별 갯수 출력)
				System.out.print('*');
			System.out.println(); 
			
		}

	}

}
