package chap1;

import java.util.Scanner;

// 1, 2, ..., n의 합을 구합니다.
public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0; //0 ,1 , 3 , 6
		int i = 0; //0,  1, 2, 3 , 4
		
		while(i <= n) { // n=3 / 0,1,2,3 / 4번 반복
			sum += i; //  
			i++;
		}
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		System.out.println("변수 i값을 출력합니다 :" + i);
	}

}
