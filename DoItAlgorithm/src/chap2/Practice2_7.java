package chap2;

import java.util.Scanner;

// 입력받은 10진수를 2진수~ 36진수로 기수 변환하여 나타냄
public class Practice2_7{

	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리(d[0], d[1]..인 역순이 아닌 정순서)부터 넣어두고 자릿수를 반환합니다.
	
	static int cardConvR(int x, int r, char[] d) {
		
		// n은 변환할 정수의 길이를 문자형태로 변환하고 x와 객체간 비교한 것.
		int n = ((Integer)x).toString().length(); // 변환 전 자릿수 / toString(): 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		int digits = 0;					//Integer은 wrapper class로 매개변수로 객체를 필요로 할 때, 기본형 값이 아닌 객체로 저장할 때, 객체간 비교가 필요할 때 사용
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 문자로 0~9, A~Z는 10~35
		
		System.out.printf(String.format("%%2d | %%%dd\n", n),r, x);  // r은 변환할 진수, x는 변환할 정수 / String.format : 출력 자리만큼 값자리를 맞춰줌
		
		
		do {
			System.out.printf("  +");
			for(int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();
			
			if(x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd  ...%%d\n", n),
						r, x / r, x % r); // 0이 아닐 때 :  16진수 계산식 나머지 구하기 r = 16 , x = 3 / 11
			else
				System.out.printf(String.format("%%%dd ... %%d\n", n),
						x / r, x % r);    // 0일때: x / r = 0 , 나머지는 3
			d[digits++] = dchar.charAt(x % r); // 최종의 나머지 값을 dchar을 통해 charAt()메소드 안에 문자형으로 가져오고, 
			x /= r;			// 첫번째 while문 결과로  배열 d[0]에 B를 넣는다. digits는 1증가, 두번째 반복으로 x = 0이므로 else결과로
							// 나머지가 3이다. dchar.charAt을 통해 문자열로 변환후 d[1]에 3을 넣고 증감식으로 digits 2가된다.
		} while( x != 0); // x가 0이 되어 do~while문 종료.
		
		// 역순으로 정렬
		for(int i = 0; i < digits/2; i++) { // 종료값은 i < 1이므로 i
			char temp = d[i]; 
			d[i] = d[digits -i -1]; // 2 -0 -1 = 1 이므로 d[1]을 -> d[0]번째에 대입하면 3
			d[digits -i -1] = temp; // d[1]에 temp에 들어있던 B를 대입하면
		}
		return digits;	// digits는 2이고, return시 배열의 값으로는 d[0] = 3, d[1] = B가 된다.
	}
	
	public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			int no; // 변환할 정수
			int cd;	// 변환할 진수(기수)
			int dno;	// 변환후의 자릿수
			int retry;	// 재실행 여부
			char[] cno = new char[32];	// 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
			
			System.out.println("10진수를 기수 변환 합니다.");
			
			do {
				do {
					System.out.print("변환하는 음이 아닌 정수:");
					no = stdIn.nextInt();
					
				}while(no < 0); // 스캐너로 입력받는 숫자가 양수일경우 while문을 종료
				
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36) : "); // 변환할 진수를 스캐너로 입력받음.
				cd = stdIn.nextInt();
				
			}while(cd < 2 || cd > 36); // 2이상 ~ 36미만의 범주안에 들면 while문 종료
			
			dno = cardConvR(no, cd, cno); // dno에는 return되는 digits의 증감값이 들어간다.
			
			System.out.print(cd + "진수로는 ");	
			for(int i = 0; i < dno; i++)	 // i = 0, 1만큼 돌수있다. dno = 2
					System.out.print(cno[i]); // cno는 문자타입 배열
				System.out.println("입니다.");
	
				System.out.print("한 번 더 할까요? (1.예 / 0.아니오) :");
				retry =stdIn.nextInt();
				
			}while(retry == 1);
	
		}
	}
