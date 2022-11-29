package chap1;

import java.util.Scanner;

public class Practice1_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형을 출력합니다.");
		
		do {
			System.out.print("변과 단수의 길이: ");
			n = stdIn.nextInt();
		}while(n <= 0); // 0이상의 숫자가 n에 들어오면 반복문 종료
 
		for (int i = 1; i <= n; i++) { // 입력한 숫자보다(n보다) 작을때까지 줄바꿈해서 반복
			for(int j = 1; j <= n; j++) // 입력한 숫자보다(n보다) 작을때까지 반복
				System.out.print('*');
			System.out.println();
		}
	}

}
