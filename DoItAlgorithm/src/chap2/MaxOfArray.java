package chap2;

import java.util.Scanner;

public class MaxOfArray {

	

		static int maxOf(int[] a) {
			
			int max = a[0];
			for(int i = 1; i < a.length; i++) // 4 < 5    1 2 3 4�� ����
				if(a[i] > max) // a[1] > a[0]~ ����
					max = a[i];  
			return max;
		}
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("Ű�� �ִ��� ���մϴ�.");
			System.out.print("��� ��: ");
			int num = stdIn.nextInt();   // �����Ͽ� �����(num) = 5, height = [130, 160, 180, 130, 120] 
			
			int[] height = new int[num];
			
			for(int i = 0; i <num; i++) {
				System.out.print("height[" + i + "]:");
				height[i] = stdIn.nextInt();
			}
	
		System.out.println("�ִ��� " + maxOf(height) + "�Դϴ�."); // �ִ� 180
		}

}
