package chap2;

import java.util.Scanner;

// �Է¹��� 10������ 2����~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
public class Practice2_7{

	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ�(d[0], d[1]..�� ������ �ƴ� ������)���� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	
	static int cardConvR(int x, int r, char[] d) {
		
		// n�� ��ȯ�� ������ ���̸� �������·� ��ȯ�ϰ� x�� ��ü�� ���� ��.
		int n = ((Integer)x).toString().length(); // ��ȯ �� �ڸ��� / toString(): ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
		int digits = 0;					//Integer�� wrapper class�� �Ű������� ��ü�� �ʿ�� �� ��, �⺻�� ���� �ƴ� ��ü�� ������ ��, ��ü�� �񱳰� �ʿ��� �� ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // ���ڷ� 0~9, A~Z�� 10~35
		
		System.out.printf(String.format("%%2d | %%%dd\n", n),r, x);  // r�� ��ȯ�� ����, x�� ��ȯ�� ���� / String.format : ��� �ڸ���ŭ ���ڸ��� ������
		
		
		do {
			System.out.printf("  +");
			for(int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();
			
			if(x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd  ...%%d\n", n),
						r, x / r, x % r); // 0�� �ƴ� �� :  16���� ���� ������ ���ϱ� r = 16 , x = 3 / 11
			else
				System.out.printf(String.format("%%%dd ... %%d\n", n),
						x / r, x % r);    // 0�϶�: x / r = 0 , �������� 3
			d[digits++] = dchar.charAt(x % r); // ������ ������ ���� dchar�� ���� charAt()�޼ҵ� �ȿ� ���������� ��������, 
			x /= r;			// ù��° while�� �����  �迭 d[0]�� B�� �ִ´�. digits�� 1����, �ι�° �ݺ����� x = 0�̹Ƿ� else�����
							// �������� 3�̴�. dchar.charAt�� ���� ���ڿ��� ��ȯ�� d[1]�� 3�� �ְ� ���������� digits 2���ȴ�.
		} while( x != 0); // x�� 0�� �Ǿ� do~while�� ����.
		
		// �������� ����
		for(int i = 0; i < digits/2; i++) { // ���ᰪ�� i < 1�̹Ƿ� i
			char temp = d[i]; 
			d[i] = d[digits -i -1]; // 2 -0 -1 = 1 �̹Ƿ� d[1]�� -> d[0]��°�� �����ϸ� 3
			d[digits -i -1] = temp; // d[1]�� temp�� ����ִ� B�� �����ϸ�
		}
		return digits;	// digits�� 2�̰�, return�� �迭�� �����δ� d[0] = 3, d[1] = B�� �ȴ�.
	}
	
	public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			int no; // ��ȯ�� ����
			int cd;	// ��ȯ�� ����(���)
			int dno;	// ��ȯ���� �ڸ���
			int retry;	// ����� ����
			char[] cno = new char[32];	// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
			
			System.out.println("10������ ��� ��ȯ �մϴ�.");
			
			do {
				do {
					System.out.print("��ȯ�ϴ� ���� �ƴ� ����:");
					no = stdIn.nextInt();
					
				}while(no < 0); // ��ĳ�ʷ� �Է¹޴� ���ڰ� ����ϰ�� while���� ����
				
			do {
				System.out.print("� ������ ��ȯ�ұ��?(2~36) : "); // ��ȯ�� ������ ��ĳ�ʷ� �Է¹���.
				cd = stdIn.nextInt();
				
			}while(cd < 2 || cd > 36); // 2�̻� ~ 36�̸��� ���־ȿ� ��� while�� ����
			
			dno = cardConvR(no, cd, cno); // dno���� return�Ǵ� digits�� �������� ����.
			
			System.out.print(cd + "�����δ� ");	
			for(int i = 0; i < dno; i++)	 // i = 0, 1��ŭ �����ִ�. dno = 2
					System.out.print(cno[i]); // cno�� ����Ÿ�� �迭
				System.out.println("�Դϴ�.");
	
				System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�) :");
				retry =stdIn.nextInt();
				
			}while(retry == 1);
	
		}
	}
