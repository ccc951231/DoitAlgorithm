package chap1;

import java.util.Scanner;

// 3���� �������� �Է��ϰ� �ִ��� ���մϴ�.

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� ��: "); int a = stdIn.nextInt(); //2
		System.out.println("b�� ��: "); int b = stdIn.nextInt(); //3
		System.out.println("c�� ��: "); int c = stdIn.nextInt(); //4
		
		int max = a; // a���� max�� ���� 2�� �ʱ�ȭ ��.
		if(b > max) max = b; // if���� true �̹Ƿ� b���� max�� ���ԵǹǷ� max�� 3���� ����
		if(c > max) max = c; // if���� true�̹Ƿ� c���� max�� ���ԵǹǷ� max�� 4�� ����
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

}
