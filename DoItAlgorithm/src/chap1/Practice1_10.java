package chap1;

import java.util.Scanner;

public class Practice1_10 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a의 값: ");
		int a = stdIn.nextInt();
		
		int b;
		while(true) { // break를 걸기위에 while문 사용
			System.out.println("b의 값: ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b - a는" + (b - a) + "입니다.");
	}

}
