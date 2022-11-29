package chap2;

import java.util.Scanner;

// 입력받은 10진수를 2진수~ 36진수로 기수 변환하여 나타냄
public class CardConvRev {

	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {							// 1. x가 59, r 16이라할 때 x는 3, 나머지는 11이므로 16진수를 문자형으로 바꾸면 B가 된다. 
			d[digits++] = dchar.charAt(x % r); // 2. d[digits++]배열에는 d[0] = B가 저장되고, ++이 있으므로 증감되어 digits는 1이된다.
			x /= r;						// 3. 다시 x인 3에서 r인 16을 나누면 x = 0 나머지는 3이므로 문자 3을 d[1]에 저장하고 digits는 증감되어 2가된다.
		}while(x != 0);					// 4. x가 0이되어 반복문이 끝나고 digits는 2가 되어 return된다.
		return digits; 
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
			
			dno = cardConvR(no, cd, cno); // no를 cd진수로 변환하면 dno에는 return되는 digits 증감한 만큼의 값이 들어간다.
			
			System.out.print(cd + "진수로는 ");	// dno에는 진수 변환한 후의 return값에 digits수가 들어있음. return값이 2일경우 dno - 1하여
			for(int i = dno -1; i >= 0; i--)	// i = 1이 되므로 배열 자리값은, cno[1] cno[0]로 i--하여 역순으로 배열값이 출력된다. 
					System.out.print(cno[i]); // cno는 문자타입 배열
				System.out.println("입니다.");
	
				System.out.print("한 번 더 할까요? (1.예 / 0.아니오) :");
				retry =stdIn.nextInt();
				
			}while(retry == 1);
	
		}
	}
