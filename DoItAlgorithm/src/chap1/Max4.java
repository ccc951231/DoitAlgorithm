package chap1;

import java.util.Scanner;


// �� ���� �ִ��� ���ϴ� Max4 �޼ҵ带 �ۼ��ϼ���.
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
		
		System.out.println("a�� ��: ");
			a = scanner.nextInt();
		System.out.println("b�� ��: ");
			b = scanner.nextInt();
		System.out.println("c�� ��: ");
		    c = scanner.nextInt();
		System.out.println("d�� ��: ");
			d = scanner.nextInt();
		    
		System.out.println("�� ���� �ִ���:  " + max4(a,b,c,d));
	
	}

}

