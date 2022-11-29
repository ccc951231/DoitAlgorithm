package chap2;

import java.util.Random;

public class practice2_1 {

	// 배열 a의 최댓값을 구하여 반환
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		
		return max;
		
	}

	public static void main(String[] args) {

		//Random rand = new Random();
		// Scanner stdIn = new Scanner(System.in);
		//Random dom = new Random();
		
		// System.out.println("키의 최댓값을 구합니다.");
		// System.out.println("사람 수: ");
		// int num = stdIn.nextInt();
//		int num = dom.nextInt(10); // 9명까지 난수
//		
//		System.out.println("사람수 : " + num);
//		int[] height = new int[num];
//		
//		for(int i = 0; i < num; i++) {
//			height[i] = 100 + rand.nextInt(90);
//			System.out.println("height[" + i + "]: " + height[i]);
//			
//		System.out.println("최댓값은" + maxOf(height) + "입니다.");
		
		// Random 함수는 한번만 선언해서 ()에 원하는 난수만 넣엊주면 된다.
		
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int num = 1 + rand.nextInt(20); // 사람 수를 1~20 사이의 난수를 구한다.
		int[] height = new int[num]; // num안의 난수만큼 배열을 생성한다. 
		
		
		System.out.println("사람 수는" + num + "명입니다.");
		System.out.println("키는 다음과 같습니다.");
		
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
	}
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	
	}

}
