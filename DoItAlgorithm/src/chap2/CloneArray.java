package chap2;

// 배열을 복제합니다.
public class CloneArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.print("a = ");
		for(int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
		
		System.out.print("\nb = ");
		for(int i = 0; i < b.length; i ++)
			System.out.print(" " + b[i]);

		
		// 배열 a의 요소가 3개일 때, 세 요소 a[0], a[1], a[2] 중 최댓값 구하는 법
//		max = a[0];
//		if(a[1] > max) 
//			max = a[1];
//		if(a[2] > max) 
//			max = a[2];
		
		// 배열 a의 요소가 4개일 때, 세 요소 a[0], a[1], a[2], a[3] 중 최댓값 구하는 법
//		max = a[0]
//	    if(a[1] > max)
//	    	max = a[1]
//	    if(a[2] > max)
//	    	max = a[2]
//	    if(a[3] > max)
//	    	max = a[3];
		
		
		// 요소 개수가 n일때 if문 실행은 n-1번 필요하다(반복문 종료값보다 작아야하므로 i < n)
		
//		int max = a[0];
//		int n = 5;
//		for(int i = 1; i < n; i++)
//			if(a[i] > max)
//				 max = a[i];
//		System.out.println("최댓값은: " + max + "입니다." );
	}

}
