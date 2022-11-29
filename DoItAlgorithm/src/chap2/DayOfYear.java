package chap2;

import java.util.Scanner;

// 그 해 경과 일 수를 구함
public class DayOfYear {

	// 각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년(28일)
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년(29일)
	};
	
	
	
	
	// 서기(서양 해 표기법으로 예수님이 탄생한 해를 기준으로 기원전후로 나뉜다.) year년은 윤년인가? (윤년 : 1 / 평년 :0)
	static int isLeap(int year) {
		
		// 년을 4로 나누었을때 떨어지면서, 년을 100으로 나누었을때 떨어지거나 년을 400으로 나눴을때 떨어진다.
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0; // true = 1 , false 0
	}

	
	static int dayOfYear(int y, int m, int d) {
		int days = d;  // 일자를 days변수에 대입한다.
		
		for(int i=1; i<m; i++)	// 월(m-1)만큼 반복하면서 mdays의 배열에 대한 값을 구한후 days에 + mdays되어 days에 대입된다.
			days += mdays[isLeap(y)][i-1]; // 평년 윤년에의 각 달에 일수에 대한 배열명 mdays, 평년이면 0, 윤년이면 1의 일수를 찾는다.
										   // 예제로 2019년은 isLeap메소드에서 false이므로 0이 되고 mdays에서 0은 평년이다. 
		return days;
	}
	
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년: "); 
			int year = stdIn.nextInt(); // 년
		
			System.out.print("월: ");
			int month = stdIn.nextInt(); // 월
			
			System.out.print("일: ");
			int day = stdIn.nextInt(); // 일
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day)); // dayOfYear메소드를 통해 구하는 수가 return되어 들어온다.
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오): ");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
	
	}
}
