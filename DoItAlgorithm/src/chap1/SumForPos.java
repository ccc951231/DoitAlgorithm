package chap1;

import java.util.Scanner;

// 1, 2, ..., n의 합을 구합니다.(양수만 입력)
public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값: "); // (
			n = stdIn.nextInt();
			
		}while(n <= 0);  // n이 0보다 클 때까지 반복(양수가 될때까지 반복하여 'n의 값: ' 이라 출력)
		
		int sum = 0; 
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		
	}

}
