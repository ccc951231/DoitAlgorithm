package chap1;

// ����ǥ�� ����մϴ�.
public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("------����ǥ------");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j); // %3d : ������ 3�ڸ� ��� 
			System.out.println();
		}
		

	}

}
