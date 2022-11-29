package chap2;

import java.util.Arrays;
import java.util.Scanner;

public class practice2_2 {
	
	// 배열요소 a[i]와 a[length]의 값을 바꾼다.
	static void swap(int[] a, int i, int length) {
		int b = a[i];
		a[i] = a[length];
		a[length] = b;
	}
	
	// 배열 a 요소를 역순으로 정렬한다.
	static void reverse(int[] a) { // a = x를 배열로 받음.
		
		System.out.println(Arrays.toString(a)); // 파라미터로 배열을 받아서 배열에 값들을 문자열 형태로 만들어서 return한다.
		
		for(int i = 0; i < a.length / 2; i++) { // 요소수의 길이에 / 2한 값만큼 반복문 돌면서 교환한 값 출력
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i -1) + "]를 교환합니다." );
			swap(a, i, a.length -i -1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // 1. 요소수를 스캐너로 입력받는다.
		
		System.out.println("요소수 입력: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; // 2. 받은 요소값을 배열로 선언한다.
		
		for(int i = 0; i < num; i++) { // 3. 반복문을 돌면서 num인 배열 길이전까지 배열의 값을 스캐너로 입력받아 채운다.
		System.out.println("x[" + i + "] :" );
		x[i] = stdIn.nextInt();

		}
		
		reverse(x);
	
	
	System.out.println("역순 정렬을 마쳤습니다.");
	}
}