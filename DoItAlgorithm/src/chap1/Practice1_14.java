package chap1;

import java.util.Scanner;

public class Practice1_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���簢���� ����մϴ�.");
		
		do {
			System.out.print("���� �ܼ��� ����: ");
			n = stdIn.nextInt();
		}while(n <= 0); // 0�̻��� ���ڰ� n�� ������ �ݺ��� ����
 
		for (int i = 1; i <= n; i++) { // �Է��� ���ں���(n����) ���������� �ٹٲ��ؼ� �ݺ�
			for(int j = 1; j <= n; j++) // �Է��� ���ں���(n����) ���������� �ݺ�
				System.out.print('*');
			System.out.println();
		}
	}

}
