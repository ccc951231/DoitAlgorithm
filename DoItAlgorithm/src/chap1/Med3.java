package chap1;

// 연습문제 1-4
// 세 값의 대소관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.

public class Med3 {
	
	// a, b, c의 중앙값을 구하여 반환
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1)); 
		System.out.println("med3(3,2,2) = " + med3(3,2,2)); 
		System.out.println("med3(3,1,2) = " + med3(3,1,2));
		System.out.println("med3(3,2,3) = " + med3(3,2,3));
		System.out.println("med3(2,1,3) = " + med3(2,1,3));
		System.out.println("med3(3,3,2) = " + med3(3,3,2));
		System.out.println("med3(3,3,3) = " + med3(3,3,3));
		System.out.println("med3(2,2,3) = " + med3(2,2,3));
		System.out.println("med3(2,3,1) = " + med3(2,3,1));
		System.out.println("med3(2,3,2) = " + med3(2,3,2));
		System.out.println("med3(1,3,2) = " + med3(1,3,2));
		System.out.println("med3(2,3,3) = " + med3(2,3,3));
		System.out.println("med3(1,2,3) = " + med3(1,2,3));
	

	}

}
