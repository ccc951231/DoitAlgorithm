package chap1;

import java.util.Scanner;

public class Min3{
	
	static int min3(int a, int b, int c) {
		int min = a; // min������ a�� �ʱ�ȭ
		if(b <= min)  // b���� min�� ũ�� false�̹Ƿ� ���� �Ұ��Ǿ�
			min = b;  // �ִ��� ���� �ʴ´�.
		if(c <= min)
			min = c;
		
		return min;
		}
	
	public static void main(String[] args) {
		
		// new Scanner(System.in)�� �ý����� �Է���ġ�κ��� ���� Scanner�� �ۼ��ϴ� �ڵ�
		Scanner scanner = new Scanner(System.in); 
		
		int a, b, c, d; // ���� ����
		
		System.out.println("�� ���� �ּڰ��� ���մϴ�.");
		System.out.print("a�� ��: ");  
			a = scanner.nextInt();  // ������ Scanner�� scanner������ �����ߴٰ� �������� Ű���忡�� �а� ������ scanner.nextLine()�޼ҵ带 ����ϸ�ȴ�.
		System.out.print("b�� ��: "); // scanner.nextLine()�޼ҵ�� ����Ű�� ġ�� ������ ��� �����̸�, ����Ű�� ġ�� �Էµ� ��� ������ Ÿ�Կ� ���� �о���δ�.
			b = scanner.nextInt();
		System.out.print("c�� ��: ");
			c = scanner.nextInt();
			
		System.out.println("�� ���� �ּڰ��� : " + min3(a,b,c));
	
	}
}

