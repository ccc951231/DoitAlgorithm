package chap1;

import java.util.Scanner;

// 1, 2, ..., n�� ���� ���մϴ�.(����� �Է�)
public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� ��: "); // (
			n = stdIn.nextInt();
			
		}while(n <= 0);  // n�� 0���� Ŭ ������ �ݺ�(����� �ɶ����� �ݺ��Ͽ� 'n�� ��: ' �̶� ���)
		
		int sum = 0; 
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
		
	}

}
