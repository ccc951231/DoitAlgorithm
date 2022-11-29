package chap2;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {
	// 두 배열 a, b의 모든 요소가 같은가?
	
	static boolean equals(int[] a, int[] b) {
		
		// 두 배열의 a, b 길이비교
		if(a.length != b.length)  // a와 b 요소의 길이가 다르면 false 같으면 for문 이동
			return false;
		
		// 두 배열의 a, b 배열 값 비교
		for(int i = 0; i < a.length; i++) // i는 0~a길이. 즉, 배열자릿수를 가르킴
			if(a[i] != b[i])		// 배열 a[0] != b[0]부터해서 a.길이만큼 비교(앞의 if문으로 인해 길이가 다르면 이미 걸러져 false로 출력되어 종료됨.)
				return false;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("배열 a의 요솟수: ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		} 
		
		System.out.print("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는" + (equals(a, b)? "같습니다" : "같지 않습니다."));
	}

}
