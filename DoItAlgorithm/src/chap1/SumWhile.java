package chap1;

import java.util.Scanner;

// 1, 2, ..., n�� ���� ���մϴ�.
public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = stdIn.nextInt();
		
		int sum = 0; //0 ,1 , 3 , 6
		int i = 0; //0,  1, 2, 3 , 4
		
		while(i <= n) { // n=3 / 0,1,2,3 / 4�� �ݺ�
			sum += i; //  
			i++;
		}
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
		System.out.println("���� i���� ����մϴ� :" + i);
	}

}
