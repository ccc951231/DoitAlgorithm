package chap1;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구합니다.

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값: "); int a = stdIn.nextInt(); //2
		System.out.println("b의 값: "); int b = stdIn.nextInt(); //3
		System.out.println("c의 값: "); int c = stdIn.nextInt(); //4
		
		int max = a; // a값이 max에 들어가서 2로 초기화 됨.
		if(b > max) max = b; // if문이 true 이므로 b값이 max에 대입되므로 max가 3으로 변경
		if(c > max) max = c; // if문이 true이므로 c값이 max에 대입되므로 max가 4로 변경
		
		System.out.println("최댓값은 " + max + "입니다.");
	}

}
