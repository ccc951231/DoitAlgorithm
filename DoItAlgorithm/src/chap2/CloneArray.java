package chap2;

// �迭�� �����մϴ�.
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

		
		// �迭 a�� ��Ұ� 3���� ��, �� ��� a[0], a[1], a[2] �� �ִ� ���ϴ� ��
//		max = a[0];
//		if(a[1] > max) 
//			max = a[1];
//		if(a[2] > max) 
//			max = a[2];
		
		// �迭 a�� ��Ұ� 4���� ��, �� ��� a[0], a[1], a[2], a[3] �� �ִ� ���ϴ� ��
//		max = a[0]
//	    if(a[1] > max)
//	    	max = a[1]
//	    if(a[2] > max)
//	    	max = a[2]
//	    if(a[3] > max)
//	    	max = a[3];
		
		
		// ��� ������ n�϶� if�� ������ n-1�� �ʿ��ϴ�(�ݺ��� ���ᰪ���� �۾ƾ��ϹǷ� i < n)
		
//		int max = a[0];
//		int n = 5;
//		for(int i = 1; i < n; i++)
//			if(a[i] > max)
//				 max = a[i];
//		System.out.println("�ִ���: " + max + "�Դϴ�." );
	}

}
