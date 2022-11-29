package chap2;

import java.util.Arrays;
import java.util.Scanner;

public class practice2_2 {
	
	// �迭��� a[i]�� a[length]�� ���� �ٲ۴�.
	static void swap(int[] a, int i, int length) {
		int b = a[i];
		a[i] = a[length];
		a[length] = b;
	}
	
	// �迭 a ��Ҹ� �������� �����Ѵ�.
	static void reverse(int[] a) { // a = x�� �迭�� ����.
		
		System.out.println(Arrays.toString(a)); // �Ķ���ͷ� �迭�� �޾Ƽ� �迭�� ������ ���ڿ� ���·� ���� return�Ѵ�.
		
		for(int i = 0; i < a.length / 2; i++) { // ��Ҽ��� ���̿� / 2�� ����ŭ �ݺ��� ���鼭 ��ȯ�� �� ���
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i -1) + "]�� ��ȯ�մϴ�." );
			swap(a, i, a.length -i -1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // 1. ��Ҽ��� ��ĳ�ʷ� �Է¹޴´�.
		
		System.out.println("��Ҽ� �Է�: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; // 2. ���� ��Ұ��� �迭�� �����Ѵ�.
		
		for(int i = 0; i < num; i++) { // 3. �ݺ����� ���鼭 num�� �迭 ���������� �迭�� ���� ��ĳ�ʷ� �Է¹޾� ä���.
		System.out.println("x[" + i + "] :" );
		x[i] = stdIn.nextInt();

		}
		
		reverse(x);
	
	
	System.out.println("���� ������ ���ƽ��ϴ�.");
	}
}