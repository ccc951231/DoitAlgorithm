package chap1;

public class Practice1_13 {

	public static void main(String[] args) {
		System.out.print(" |");
		for(int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+----------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for(int j = 1; j <=9; j++) 
				System.out.printf("%3d", i + j); // �ߺ� for������ i+j �� ��, �ٱ� ���� i�� ����ϹǷ� 
				System.out.println();			// ���� for������ {} �߰�ȣ�� ���� ����� ���� �̻��ϰ� ���´�.
			
				
		}

	}

}