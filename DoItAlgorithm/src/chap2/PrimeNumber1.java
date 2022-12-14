package chap2;

// 1000이하의 소수를 열거(버전1)
public class PrimeNumber1 {

	public static void main(String[] args) {

		int counter = 0; // 나눗셈의 횟수
		
		for(int n = 2; n <= 1000; n++) { // 증감식이 n++이므로, 반복문 1씩증가하면서 2~1000까지 반복
			int i;
			for(i = 2; i < n; i++) { // i가 2~999까지 반복(반복문 제일 처음 돌때는 n=2, i=2이고 i<n이 성립 되지 않으므로 반복문이 돌지 않고,counter++하지않는다.
				counter++;	// 나눗셈한 횟수 증가
				if(n % i == 0) // 나누어서 나머지가 0이되면 소수가 아님(나누어 떨어지는 정수가 하나 이상 존재하면 합성수다.)
					break;	// 더이상의 반복은 불필요
			}
			if(n == i) // 마지막까지 나누어 떨어지지 않음
			System.out.println(n);
			}
		
		System.out.println("나눗셈을 수행한 횟수: " + counter);
	}

}
// 반복문 세아리기

// counter=15 .... 중략
// 반복횟수                                                                                   나눗셈 횟수 결과
//   1.     n=2, i=2 i<n 성립x                                                                 나누지 않음
//   2.     n=3, i=2 i<n 성립o  i=3 성립x -> 안쪽 반복문 종료	                                          1            나머지가 1.5인 소수이므로 안쪽for문으로 돌아간다.
//   3.     n=4, i=2 i<n 성립o                                                                     1            나머지 0 -> break로 안쪽 반복문 빠져나감
//   4.     n=5, i=2 i<n 성립o  i=3 성립o  i=4 성립o i=5 성립x -> 안쪽 반복문 종료                                                3            나머지1 -> 0이 아니므로 반복  / 나머지2 -> 0이 아니므로 반복 / 나머지1 -> 0이 아니므로 안쪽 for문으로 돌아간다.
//   5.     n=6, i=2 i<n 성립0                                                                     1            나머지0 -> break로 안쪽 반복문 빠져나감
//   6.     n=7, i=2 i<n 성립o  i=3 성립0 i=4 성립0  i=5 성립o i=6 성립o i=7 성립x -> 안쪽 반복문종료       5            나머지1 -> 0이 아니므로 반복 / 나머지1 -> 0이 아니므로 반복 / 나머지3 -> 0이 아니므로 반복 / 나머지2 -> 0이 아니므로 반복 / 나머지가1 -> 0이아니므로 반복 /
//   7.     n=8, i=2 i<n 성립o                                                                     1            나머지0 -> break로 반복문 빠져나감
//   8.     n=9, i=2 i<n 성립o  i=3 성립0                                                           2            나머지1 -> 0이 아니므로 반복 / 나머지0 -> break로 반복문 빠져나감
//   9.     n=10, i=2 성립o                                                                        1            나머지0 -> 바깥쪽 반복문으로 빠져나감...
//   ......중략
// n=1000, i=2까지 안쪽 반복문 빠져나갈때마다 if문에 부합하면(n과 i가 같을때) n을 출력.

// 최종 counter된 횟수 출력(System.out.println("나눗셈을 수행한 횟수: " + counter);

// 실행결과 : 2, 3, 5, 7...... 991, 997
//          3
//          5
//          7
//          .... 중략
//          991,
//          997 
//          나눗셈을 수행한 횟수 : 78022


