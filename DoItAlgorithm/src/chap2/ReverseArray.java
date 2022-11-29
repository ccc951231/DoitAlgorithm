package chap2;

import java.util.Scanner;

// �迭 ��ҿ� ���� �о�鿩 �������� �����մϴ�.
public class ReverseArray {
	
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t; 
	}
	
	// �迭�� a ��Ҹ� �������� ����
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length -i -1); // �迭���̰� 5��� �����Ҷ�, swap�޼ҵ带 �̿��� a.length(����) / 2���Ͽ� 
										// a�迭�� a[i] (0 , 1)�� a[length - i -1] (3, 4)�� �ڸ����� ���� ��ȯ�Ѵ�.
										// 2�ڸ� ��� �߰����̹Ƿ� �����Ƿ� ���� ���� ���� �״�� �ִ�.
	}
	
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i <num; i++) { // �Է��� ��Ҽ���ŭ x[] �迭�ȿ� ���� �ݺ����� ���� scanner�� ���� ��������.
			System.out.print("x[" + i + "]: " );
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);  // �迭 a�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i = 0; i < num; i++)
			System.out.println("x[" + i + "] =" + x[i]);

	}

}
