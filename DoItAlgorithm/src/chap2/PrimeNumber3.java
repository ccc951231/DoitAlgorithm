package chap2;

// �ڿ����� 1, �Ҽ�, �ռ����� 3������ �ִ�.
// �Ҽ� : 1���� ū �ڿ����� 1�� �ڱ��ڽŸ��� ����� ������ ��. ��, ����� 2���� �μ��� �Ҽ�����.(2, 3, 5, 7, 11, 13, 17, 19....))
// �ռ��� : 1���� ū �ڿ��� �߿��� �Ҽ��� �ƴѼ� �� ����� 3���̻� ������.

//1000������ �Ҽ��� ����(����3)
public class PrimeNumber3 {

	public static void main(String[] args) {

		int counter = 0; // 6+1
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2; // prime[0] = 2
		prime[ptr++] = 3; // prime[1] = 3
		
		
		// prime[2, 3]
		for(int n = 5; n <= 1000; n+=2) { // 1-1. n=5���� ����  2-1. n=7  3-1. n=9
			boolean flag = false;
			
			// prime[i]�� ����(prime[i] * prime[i])�� n�����ΰ�? 
			for(int i = 1; prime[i] * prime[i] <= n; i++) { // 1-2. 2*2=4 -> 4 <= n(5) ����o, i=2����
				counter += 2;								// 1-4. 3*3=9 9<=5 ->�ݺ��� ����  2-2. 4<=7 ����o  2-4. 9<=7 -> �ݺ��� ����   3-2. 4<=9 ����o
															// 3-4. 9<=9 ����o
				
				// ������ �������� �Ҽ����ƴϴ�.(�ռ����̴�.) // ������ �������� ����� �ִ�(�Ҽ��� ����� 1�� �ڱ��ڽ��� ���̹Ƿ�)
				// n/prime[i]�� 0(�����������.
				if(n % prime[i] == 0) { // 1-3. n������ prime[i] = 5/2�� ������1 -> false ����x  2-3. 7/2..1  3-3. 9/2..1  3-5. 9/3=0 ����o
					flag = true;  // �Ҽ��� true
					break;	
				}			}
			
			// true�̸� if������(!flag=�Ҽ��̸�)
			if(!flag) { // 1-5. false�̹Ƿ� ����x 2-5. false ����x  3-6. true ����o
				
				// �Ҽ��� ���� �迭�� �����Ѵ�.
				prime[ptr++] = n; // 3-7. n=9 -> prime[2] = n -> prime[2]�� ���� 9�̵ȴ�.
				counter++;
			}
		}
		
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("������ �������� ������ Ƚ�� : " + counter);

	}

}
