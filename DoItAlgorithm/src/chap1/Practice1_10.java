package chap1;

import java.util.Scanner;

public class Practice1_10 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a�� ��: ");
		int a = stdIn.nextInt();
		
		int b;
		while(true) { // break�� �ɱ����� while�� ���
			System.out.println("b�� ��: ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		System.out.println("b - a��" + (b - a) + "�Դϴ�.");
	}

}
