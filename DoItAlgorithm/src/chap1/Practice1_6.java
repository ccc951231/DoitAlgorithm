package chap1;
import java.util.Scanner;

//����1-8
//����a, b�� �����Ͽ� �� ������ ��� ������ ������ ���մϴ�

class Practice1_6 {

	static int sumof(int a, int b) {
		int min;		// a, b�� ���� ���� �� 
		int max;		// a, b�� ū ���� �� 

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;		// ����
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� b�� �����Ͽ� �� ���̿� �ִ� ��� ������ ������ ���մϴ�.");
		System.out.print("a�� �� : "); 
		int a = stdIn.nextInt();
		System.out.print("b�� �� : "); 
		int b = stdIn.nextInt();

		System.out.println("���� a, b ������ ��� ������ ������ " + sumof(a, b) + "�Դϴ�.");
	}
}
