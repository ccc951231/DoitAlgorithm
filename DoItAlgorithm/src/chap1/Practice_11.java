package chap1;

import java.util.Scanner;

// ���� �������� �ڸ����� ���Ͽ� ����ϼ���.
public class Practice_11 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		
		int n;
		do {
			System.out.println("������: ");
			n = stdIn.nextInt();
			
		}while(n <= 0); // �����̸� �ٽ� �������Է��ϱ� 
		
		int no = 0; // �ڸ���
		while(n > 0) {  // 1000�� ��, �ݺ� 4���ϰԵ� 1. 1000/10 = 100 -> �ڸ��� 1���� , 2. 100/10 = 10 -> �ڸ��� 2����,
			n /= 10;	// 3. 10/10 = 1 -> �ڸ��� 3 ����, 1/10 = 0.1 -> �ڸ��� 4���� �� ���̻� ������ �Ұ��ϹǷ� �ݺ��� ����. 
			no++;
		}
		System.out.println("�� ����" + no + "�ڸ��Դϴ�.");
	}

}
