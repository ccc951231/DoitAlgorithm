package chap2;

import java.util.Scanner;

public class practice2_3 {

	
	static int sumOf(int[] a) { // static void re
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // 1. ��ĳ�� ����
		
		System.out.println("��Ҽ� �Է�: "); 
		int num = stdIn.nextInt();	// 2. �Է��� ��Ҽ� ��ĵ�Ͽ� num ������ �ֱ�
		
		int[] x = new int[num]; // 3. �Է��� ��Ҽ� ���� ŭ x�迭 ����.
		
		for(int i = 0; i < num; i++) {	// 4.�ݺ��� ���鼭 ����� �� �Է�
			System.out.print("x[" + i + "] : "); 
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("��Ҽ��� �հ�� " + sumOf(x) + "�Դϴ�."); // 5. �հ� �޼ҵ� ȣ��
		
		

	}

}
