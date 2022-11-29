package chap2;

import java.util.Scanner;

// 신체 검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class PhysicalExamination {

	
	static final int VMAX =21; // 시력 분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData{
		String name; // 이름
		int height; // 키
		double vision; // 시력
	
		// 생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	
	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) { // PhyscData[] 배열의 x변수 안의 값이 dat에 들어온다.
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) // dat.length = 7
			sum += dat[i].height; // i가 0~6으로 바뀌면서 배열길이자리가 계속 바뀌고, 해당 자리의 키값을 가져온다. -> sum하여 키를 누적
		
		return sum / dat.length; // 1192 / 7 = 170.28..인데 반올림하여 170.3이 리턴
	}
	
	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) { // PhyscData형 배열과 정수형 배열을 인자로 받음.
		int i=0;
		
		dist[i] = 0;
		for(i=0; i<dat.length; i++) {
			// 0.0~2.1사이면 if문 실행
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){ // VMAX=21, 21 / 10.0 = 2.1한 값이 dat배열을 돌면서 추출해낸 시력값보다 같거나 작아야한다.
				dist[(int)(dat[i].vision * 10)]++; // dist[]가 정수형이므로 *10을 해준다.   dat[0]은 0.3 *10 하면 3이된다. dist[]배열의 3번째자리로 dist[3]=1명 입력후 후위증감연산자를 통해 자리값 증감시킨다.
			}									// for문으로 돌아가서 i=2 if문에 만족(0.7이 0.0~2.1사이)하면 if문 실행 -> dat[1]은 0.7 *10하면 7이된다. dist[7]번째 자리에 1명(7인 숫자는 1개), 
											// 후위증감식을 통해 dist[]의 자리값이 증가되고 다시 for문으로 이동...... dat[2]는 2.0*1.0하면 20이된다. dist[20]의 자리에 1명이다. 증감후 -> 다시 for문....
											// 반복하며 dist[] 배열이 완성된다.(dist[]의 자리값이 입력안된 자리는 int형 기본값 0이 들어가게 되어 계산된다.)
		
//		System.out.println(dist[0]);
//		System.out.println(dist[1]);
//		System.out.println(dist[2]);
//		System.out.println(dist[3]);
//		System.out.println(dist[4]);
//		System.out.println(dist[5]);
//		System.out.println(dist[6]);
//		System.out.println(dist[7]);
//		System.out.println(dist[8]);
//		System.out.println(dist[9]);
//		System.out.println(dist[12]);
		}
		
	}	
	

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
	};
	int[] vdist = new int[VMAX]; // 시력분포
	
	System.out.println("---신체 검사 리스트---");
	System.out.println("이름        키   시력");
	System.out.println("-------------------");
	for(int i=0; i<x.length; i++) // PhyscData배열의 길이 7-1 만큼 반복
		System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	
	System.out.printf("\n평균 키:%5.1fcm\n", aveHeight(x));
	
	distVision(x, vdist); // 시력분포

	
	System.out.println("\n시력 분포");
	for(int i=0; i<VMAX; i++)
		System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]); // 0/10.0 = 0.0, 1/10.0= 0.1, 2/10.0= 0.2,.... vdist[i]는 시력분포 메소드의 dist[]값이 리턴되어 함께 출력된다. 
	}
}

