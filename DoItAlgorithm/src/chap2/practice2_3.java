package chap2;

import java.util.Scanner;

public class practice2_3 {

	
	static int sumOf(int[] a) { // static void re
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // 1. 스캐너 생성
		
		System.out.println("요소수 입력: "); 
		int num = stdIn.nextInt();	// 2. 입력한 요소수 스캔하여 num 변수에 넣기
		
		int[] x = new int[num]; // 3. 입력한 요소수 값만 큼 x배열 생성.
		
		for(int i = 0; i < num; i++) {	// 4.반복문 돌면서 요소의 값 입력
			System.out.print("x[" + i + "] : "); 
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("요소수의 합계는 " + sumOf(x) + "입니다."); // 5. 합계 메소드 호출
		
		

	}

}
