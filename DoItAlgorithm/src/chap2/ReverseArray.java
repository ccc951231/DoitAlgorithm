package chap2;

import java.util.Scanner;

// 배열 요소에 값을 읽어들여 역순으로 정렬합니다.
public class ReverseArray {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t; 
	}
	
	// 배열의 a 요소를 역순으로 정렬
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length -i -1); // 배열길이가 5라고 가정할때, swap메소드를 이용해 a.length(길이) / 2를하여 
										// a배열의 a[i] (0 , 1)와 a[length - i -1] (3, 4)의 자리값을 서로 교환한다.
										// 2자리 경우 중간값이므로 버리므로 역순 계산시 값은 그대로 있다.
	}
	
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i <num; i++) { // 입력한 요소수만큼 x[] 배열안에 값을 반복문을 통해 scanner로 읽혀 쓰여진다.
			System.out.print("x[" + i + "]: " );
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);  // 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++)
			System.out.println("x[" + i + "] =" + x[i]);

	}

}
