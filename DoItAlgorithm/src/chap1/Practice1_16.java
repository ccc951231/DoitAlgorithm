package chap1;

import java.util.Scanner;

public class Practice1_16 {

	static void spira(int n) {
		for(int i = 1; i <= n; i++) { // 세로방향 단수
			for(int j = 1; j <= n-i; j++) // 공백 수
				System.out.print(' ');
			for(int j = 1; j <= (i-1)*2+1; j++) // * 수
				System.out.print('*');
			System.out.println();
			
			
		}
		
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드를 출력합니다.");
		do {
			System.out.print("단수는: ");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		spira(n);
	}

}
