package chap2;

import java.util.Scanner;

// �Է¹��� 10������ 2����~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
public class CardConvRev {

	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {							// 1. x�� 59, r 16�̶��� �� x�� 3, �������� 11�̹Ƿ� 16������ ���������� �ٲٸ� B�� �ȴ�. 
			d[digits++] = dchar.charAt(x % r); // 2. d[digits++]�迭���� d[0] = B�� ����ǰ�, ++�� �����Ƿ� �����Ǿ� digits�� 1�̵ȴ�.
			x /= r;						// 3. �ٽ� x�� 3���� r�� 16�� ������ x = 0 �������� 3�̹Ƿ� ���� 3�� d[1]�� �����ϰ� digits�� �����Ǿ� 2���ȴ�.
		}while(x != 0);					// 4. x�� 0�̵Ǿ� �ݺ����� ������ digits�� 2�� �Ǿ� return�ȴ�.
		return digits; 
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
			
			dno = cardConvR(no, cd, cno); // no�� cd������ ��ȯ�ϸ� dno���� return�Ǵ� digits ������ ��ŭ�� ���� ����.
			
			System.out.print(cd + "�����δ� ");	// dno���� ���� ��ȯ�� ���� return���� digits���� �������. return���� 2�ϰ�� dno - 1�Ͽ�
			for(int i = dno -1; i >= 0; i--)	// i = 1�� �ǹǷ� �迭 �ڸ�����, cno[1] cno[0]�� i--�Ͽ� �������� �迭���� ��µȴ�. 
					System.out.print(cno[i]); // cno�� ����Ÿ�� �迭
				System.out.println("�Դϴ�.");
	
				System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�) :");
				retry =stdIn.nextInt();
				
			}while(retry == 1);
	
		}
	}
