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
				System.out.printf("%3d", i + j); // 중복 for문에서 i+j 할 때, 바깥 루프 i를 사용하므로 
				System.out.println();			// 내부 for문에서 {} 중괄호를 쓰면 결과가 조금 이상하게 나온다.
			
				
		}

	}

}
