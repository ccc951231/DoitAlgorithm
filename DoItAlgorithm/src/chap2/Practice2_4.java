package chap2;

import java.util.Scanner;

public class Practice2_4 {

	
	static void copy(int[] a, int[] b) {
		
		int num = a.length <= b.length ? a.length: b.length;
		for(int i = 0; i < num; i++) // ������ num�� a����, �ٸ��� b�� ���̰� ��.
			a[i] = b[i];
		
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // 1. ��Ҽ��� �о���� ��ĳ�� ����
		
		System.out.println("a�� ��Ҽ�: ");  // 2. ��Ҽ��� ��ĳ�ʷ� �Է¹ޱ�
		int numa = stdIn.nextInt();
		
		int[] a = new int[numa];	 // 3. ��Ҽ� ���̸�ŭ �迭 ����. a[]��� �̸��� �迭 ����
		
		for(int i = 0; i < numa; i++) {		// 4. �迭 ���̸�ŭ �ݺ��� ���鼭 �� �Է�.
			System.out.print("a]" + i + "]: ");
			a[i] = stdIn.nextInt();
			
		}
		
		
		System.out.println("b�� ��Ҽ�: "); 
		int numb = stdIn.nextInt();
		
		int[] b = new int[numb]; // 
		
		for(int i = 0; i < numb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt(); 
		}
		
		copy(a, b);
		
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� copy�Ͽ����ϴ�.");
		
		for(int i = 0; i < numa; i++)
			System.out.println("a[" + i + "]= " + a[i]);
		}
		
	}

