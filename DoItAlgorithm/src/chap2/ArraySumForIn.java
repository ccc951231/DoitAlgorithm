package chap2;

// 배열의 모든 요소의 합을 구하여 출력함(확장 for문)
public class ArraySumForIn {

	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

		
		for(int i=0; i < a.length; i++)
			System.out.println("a[" + i + "] =" + a[i]);
	
		double sum = 0; 
		
		for(double i : a) // ':' = 'in'(~안에있는)이란 의미 , 배열의 요소수(길이)를 조사하는 수고를 덜 수 있다.
			sum += i; 
		
		
		
		System.out.println("모든 요소의 합은" + sum + "입니다.");
		
		
	}
}
