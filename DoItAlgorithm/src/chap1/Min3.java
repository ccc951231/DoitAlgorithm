package chap1;

import java.util.Scanner;

public class Min3{
	
	static int min3(int a, int b, int c) {
		int min = a; // min변수에 a값 초기화
		if(b <= min)  // b보다 min이 크면 false이므로 실행 불가되어
			min = b;  // 최댓값이 들어가지 않는다.
		if(c <= min)
			min = c;
		
		return min;
		}
	
	public static void main(String[] args) {
		
		// new Scanner(System.in)은 시스템의 입력장치로부터 읽은 Scanner을 작성하는 코드
		Scanner scanner = new Scanner(System.in); 
		
		int a, b, c, d; // 변수 선언
		
		System.out.println("세 값의 최솟값을 구합니다.");
		System.out.print("a의 값: ");  
			a = scanner.nextInt();  // 생성된 Scanner은 scanner변수에 저장했다가 언제든지 키보드에서 읽고 싶을때 scanner.nextLine()메소드를 사용하면된다.
		System.out.print("b의 값: "); // scanner.nextLine()메소드는 엔터키를 치기 전까지 대기 상태이며, 엔터키를 치면 입력된 모든 내용을 타입에 따라 읽어들인다.
			b = scanner.nextInt();
		System.out.print("c의 값: ");
			c = scanner.nextInt();
			
		System.out.println("세 값의 최솟값은 : " + min3(a,b,c));
	
	}
}

