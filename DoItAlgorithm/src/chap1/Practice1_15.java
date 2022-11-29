package chap1;

import java.util.Scanner;

public class Practice1_15 {

	static void triangleLb(int n) { // 왼쪽 아래 직각삼각형
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
			
		}
		
	}
	
	static void triangleLU(int n) { // 왼쪽 위 직각삼각형
		for(int i =1; i <= n; i++){
			for(int j = 1; j <= n-i+1; j++)
				System.out.print('*');
			System.out.println(); 
		}
	}
	
	static void triangleRU(int n) { // 오른쪽 위 직각삼각형
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i-1; j++) // 공백출력 반복문(i-1개의 ' '을 출력)
				System.out.print(' ');
			for(int j = 1; j <= n-i+1; j++) // n-i+1개의 *출력
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRB(int n) { // 오른쪽 아래 직각삼각형
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)  // 공백출력 반복문(n-i개의 ' '을 출력)
				System.out.print(' ');
			for(int j = 1; j <= i; j++) // i개의 '*'을 출력
				System.out.print('*');
			System.out.println(); 
		}
		
	}
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	int n;
	
	do {
		System.out.print("단수는: ");
		n = stdIn.nextInt();
	}while(n <= 0);
	
	System.out.println("왼쪽 아래 직각삼각형");
	triangleLb(n);
	
	System.out.println("왼쪽 위 직각삼각형");
	triangleLU(n);
	
	System.out.println("오른쪽 위 직각삼각형");
	triangleRU(n);
	
	System.out.println("오른쪽 아래 직각함각형");
	triangleRB(n);
	}

}
