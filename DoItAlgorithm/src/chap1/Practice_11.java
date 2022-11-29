package chap1;

import java.util.Scanner;

// 양의 정숫값의 자리수를 구하여 출력하세요.
public class Practice_11 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정숫값의 자리수를 구합니다.");
		
		int n;
		do {
			System.out.println("정숫값: ");
			n = stdIn.nextInt();
			
		}while(n <= 0); // 음수이면 다시 정숫값입력하기 
		
		int no = 0; // 자릿수
		while(n > 0) {  // 1000일 때, 반복 4번하게됨 1. 1000/10 = 100 -> 자릿수 1증가 , 2. 100/10 = 10 -> 자릿수 2증가,
			n /= 10;	// 3. 10/10 = 1 -> 자릿수 3 증가, 1/10 = 0.1 -> 자릿수 4증가 후 더이상 나누기 불가하므로 반복문 종료. 
			no++;
		}
		System.out.println("그 수는" + no + "자리입니다.");
	}

}
