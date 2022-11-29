package chap1;

import java.util.Scanner;

public class Practice1_17 {
	
	static void npira(int n) {
		
		for(int i = 1; i <= n; i++) { // 세로방향 단수
			for(int j = 1; j <= n-i; j++) // 가로방향 공백 수
				System.out.print(' ');
			for(int j = 1; j <= (i-1)*2+1; j++) // 가로방향 해당 갯수만큼 숫자 출력 
				System.out.print(i % 10); // i를 10으로 나눈다. 계산시 헷갈리는 것으로 소수점까지 나눠서 나머지를 만들면안된다.
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("숫자 피라미드를 출력합니다.");
		
		do {
			System.out.print("단수는: ");
			n = stdIn.nextInt();
			
		}while(n <= 0); // 양수일때 반복문 종료
	
		npira(n);

	}

}
