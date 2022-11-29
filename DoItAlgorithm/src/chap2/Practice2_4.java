package chap2;

import java.util.Scanner;

public class Practice2_4 {

	
	static void copy(int[] a, int[] b) {
		
		int num = a.length <= b.length ? a.length: b.length;
		for(int i = 0; i < num; i++) // 같으면 num에 a길이, 다르면 b의 길이가 들어감.
			a[i] = b[i];
		
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // 1. 요소수를 읽어들일 스캐너 생성
		
		System.out.println("a의 요소수: ");  // 2. 요소수를 스캐너로 입력받기
		int numa = stdIn.nextInt();
		
		int[] a = new int[numa];	 // 3. 요소수 길이만큼 배열 생성. a[]라는 이름의 배열 생성
		
		for(int i = 0; i < numa; i++) {		// 4. 배열 길이만큼 반복문 돌면서 값 입력.
			System.out.print("a]" + i + "]: ");
			a[i] = stdIn.nextInt();
			
		}
		
		
		System.out.println("b의 요소수: "); 
		int numb = stdIn.nextInt();
		
		int[] b = new int[numb]; // 
		
		for(int i = 0; i < numb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt(); 
		}
		
		copy(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 copy하였습니다.");
		
		for(int i = 0; i < numa; i++)
			System.out.println("a[" + i + "]= " + a[i]);
		}
		
	}

