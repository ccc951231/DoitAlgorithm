package chap1;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.print("�� �� �ﰢ���Դϱ�?: ");
			n = stdIn.nextInt();
		}while(n <= 0); // 0���� ũ�� �ݺ��� ����
		 
		for(int i = 1; i <= n; i++) { // ���ι��� �ݺ�
			for(int j = 1; j <= i; j++) // ���ι��� �ݺ�(�� ���� i��ŭ �� ���� ���)
				System.out.print('*');
			System.out.println(); 
			
		}

	}

}
