package chap2;

import java.util.Scanner;

// �� �� ��� �� ���� ����
public class DayOfYear {

	// �� ���� �ϼ�
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // ���(28��)
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // ����(29��)
	};
	
	
	
	
	// ����(���� �� ǥ������� �������� ź���� �ظ� �������� ������ķ� ������.) year���� �����ΰ�? (���� : 1 / ��� :0)
	static int isLeap(int year) {
		
		// ���� 4�� ���������� �������鼭, ���� 100���� ���������� �������ų� ���� 400���� �������� ��������.
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0; // true = 1 , false 0
	}

	
	static int dayOfYear(int y, int m, int d) {
		int days = d;  // ���ڸ� days������ �����Ѵ�.
		
		for(int i=1; i<m; i++)	// ��(m-1)��ŭ �ݺ��ϸ鼭 mdays�� �迭�� ���� ���� ������ days�� + mdays�Ǿ� days�� ���Եȴ�.
			days += mdays[isLeap(y)][i-1]; // ��� ���⿡�� �� �޿� �ϼ��� ���� �迭�� mdays, ����̸� 0, �����̸� 1�� �ϼ��� ã�´�.
										   // ������ 2019���� isLeap�޼ҵ忡�� false�̹Ƿ� 0�� �ǰ� mdays���� 0�� ����̴�. 
		return days;
	}
	
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("��: "); 
			int year = stdIn.nextInt(); // ��
		
			System.out.print("��: ");
			int month = stdIn.nextInt(); // ��
			
			System.out.print("��: ");
			int day = stdIn.nextInt(); // ��
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day)); // dayOfYear�޼ҵ带 ���� ���ϴ� ���� return�Ǿ� ���´�.
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�): ");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
	
	}
}
