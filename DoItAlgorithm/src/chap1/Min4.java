package chap1;

import java.util.Scanner;

// �� ���� �ּڰ��� ���ϴ� min4�޼ҵ带 �ۼ��ϼ���.
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
		
		System.out.println("a�� ����: ");
			a = scanner.nextInt();
		System.out.println("b�� ����: ");
			b = scanner.nextInt();
		System.out.println("c�� ����: ");
			c = scanner.nextInt();
		System.out.println("d�� ����: ");
			d = scanner.nextInt();
			
		System.out.println("�� ���� �ּڰ���: " + min4(a, b, c, d));

	}

}
