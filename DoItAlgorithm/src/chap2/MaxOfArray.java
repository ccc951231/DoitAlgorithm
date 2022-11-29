package chap2;

import java.util.Scanner;

public class MaxOfArray {

	

		static int maxOf(int[] a) {
			
			int max = a[0];
			for(int i = 1; i < a.length; i++) // 4 < 5    1 2 3 4번 돌기
				if(a[i] > max) // a[1] > a[0]~ 시작
					max = a[i];  
			return max;
		}
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("키의 최댓값을 구합니다.");
			System.out.print("사람 수: ");
			int num = stdIn.nextInt();   // 가정하여 사람수(num) = 5, height = [130, 160, 180, 130, 120] 
			
			int[] height = new int[num];
			
			for(int i = 0; i <num; i++) {
				System.out.print("height[" + i + "]:");
				height[i] = stdIn.nextInt();
			}
	
		System.out.println("최댓값은 " + maxOf(height) + "입니다."); // 최댓값 180
		}

}
