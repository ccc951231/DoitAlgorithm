package chap1;

import java.util.Scanner;

public class Judge123A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. :");
		int n = stdIn.nextInt();
		
		if(n == 1)
			System.out.println("�� ���� 1�Դϴ�.");
		else if(n == 2)
			System.out.println("�� ���� 2�Դϴ�.");
		else if(n == 3)
			System.out.println("�� ���� 3�Դϴ�.");
		else
			;

	}
}
