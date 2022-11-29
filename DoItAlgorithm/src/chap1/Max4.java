package chap1;

import java.util.Scanner;


// 네 값의 최댓값을 구하는 Max4 메소드를 작성하세요.
public class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) 
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
		
			
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("a의 값: ");
			a = scanner.nextInt();
		System.out.println("b의 값: ");
			b = scanner.nextInt();
		System.out.println("c의 값: ");
		    c = scanner.nextInt();
		System.out.println("d의 값: ");
			d = scanner.nextInt();
		    
		System.out.println("네 값의 최댓값은:  " + max4(a,b,c,d));
	
	}

}

