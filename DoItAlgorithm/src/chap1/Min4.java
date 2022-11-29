package chap1;

import java.util.Scanner;

// 네 값의 최솟값을 구하는 min4메소드를 작성하세요.
public class Min4 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("a의 값은: ");
			a = scanner.nextInt();
		System.out.println("b의 값은: ");
			b = scanner.nextInt();
		System.out.println("c의 값은: ");
			c = scanner.nextInt();
		System.out.println("d의 값은: ");
			d = scanner.nextInt();
			
		System.out.println("네 값의 최솟값은: " + min4(a, b, c, d));

	}

}
