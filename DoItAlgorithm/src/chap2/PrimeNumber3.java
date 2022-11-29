package chap2;

// 자연수에 1, 소수, 합성수가 3가지가 있다.
// 소수 : 1보다 큰 자연수중 1과 자기자신만을 약수로 가지는 수. 즉, 약수가 2개인 인수를 소수라함.(2, 3, 5, 7, 11, 13, 17, 19....))
// 합성수 : 1보다 큰 자연수 중에서 소수가 아닌수 즉 약수를 3개이상 가진다.

//1000이하의 소수를 열거(버전3)
public class PrimeNumber3 {

	public static void main(String[] args) {

		int counter = 0; // 6+1
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2; // prime[0] = 2
		prime[ptr++] = 3; // prime[1] = 3
		
		
		// prime[2, 3]
		for(int n = 5; n <= 1000; n+=2) { // 1-1. n=5부터 시작  2-1. n=7  3-1. n=9
			boolean flag = false;
			
			// prime[i]의 제곱(prime[i] * prime[i])이 n이하인가? 
			for(int i = 1; prime[i] * prime[i] <= n; i++) { // 1-2. 2*2=4 -> 4 <= n(5) 성립o, i=2증감
				counter += 2;								// 1-4. 3*3=9 9<=5 ->반복문 종료  2-2. 4<=7 성립o  2-4. 9<=7 -> 반복문 종료   3-2. 4<=9 성립o
															// 3-4. 9<=9 성립o
				
				// 나누어 떨어지면 소수가아니다.(합성수이다.) // 나누어 떨어지면 약수가 있다(소수는 약수가 1과 자기자신의 수이므로)
				// n/prime[i]은 0(나누어떨어진다.
				if(n % prime[i] == 0) { // 1-3. n나누기 prime[i] = 5/2는 나머지1 -> false 실행x  2-3. 7/2..1  3-3. 9/2..1  3-5. 9/3=0 성립o
					flag = true;  // 소수는 true
					break;	
				}			}
			
			// true이면 if문실행(!flag=소수이면)
			if(!flag) { // 1-5. false이므로 실행x 2-5. false 실행x  3-6. true 실행o
				
				// 소수인 것을 배열에 저장한다.
				prime[ptr++] = n; // 3-7. n=9 -> prime[2] = n -> prime[2]의 값은 9이된다.
				counter++;
			}
		}
		
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);

	}

}
