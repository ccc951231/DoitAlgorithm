package chap1;

import java.util.Scanner;

public class Practice1_17 {
	
	static void npira(int n) {
		
		for(int i = 1; i <= n; i++) { // ���ι��� �ܼ�
			for(int j = 1; j <= n-i; j++) // ���ι��� ���� ��
				System.out.print(' ');
			for(int j = 1; j <= (i-1)*2+1; j++) // ���ι��� �ش� ������ŭ ���� ��� 
				System.out.print(i % 10); // i�� 10���� ������. ���� �򰥸��� ������ �Ҽ������� ������ �������� �����ȵȴ�.
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ƕ�̵带 ����մϴ�.");
		
		do {
			System.out.print("�ܼ���: ");
			n = stdIn.nextInt();
			
		}while(n <= 0); // ����϶� �ݺ��� ����
	
		npira(n);

	}

}
