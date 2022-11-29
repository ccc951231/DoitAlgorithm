package chap2;

import java.util.Scanner;

// ��ü �˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ����
public class PhysicalExamination {

	
	static final int VMAX =21; // �÷� ����(0.0���� 0.1������ 21��)
	
	static class PhyscData{
		String name; // �̸�
		int height; // Ű
		double vision; // �÷�
	
		// ������
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	
	// Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) { // PhyscData[] �迭�� x���� ���� ���� dat�� ���´�.
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) // dat.length = 7
			sum += dat[i].height; // i�� 0~6���� �ٲ�鼭 �迭�����ڸ��� ��� �ٲ��, �ش� �ڸ��� Ű���� �����´�. -> sum�Ͽ� Ű�� ����
		
		return sum / dat.length; // 1192 / 7 = 170.28..�ε� �ݿø��Ͽ� 170.3�� ����
	}
	
	// �÷� ������ ����
	static void distVision(PhyscData[] dat, int[] dist) { // PhyscData�� �迭�� ������ �迭�� ���ڷ� ����.
		int i=0;
		
		dist[i] = 0;
		for(i=0; i<dat.length; i++) {
			// 0.0~2.1���̸� if�� ����
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){ // VMAX=21, 21 / 10.0 = 2.1�� ���� dat�迭�� ���鼭 �����س� �÷°����� ���ų� �۾ƾ��Ѵ�.
				dist[(int)(dat[i].vision * 10)]++; // dist[]�� �������̹Ƿ� *10�� ���ش�.   dat[0]�� 0.3 *10 �ϸ� 3�̵ȴ�. dist[]�迭�� 3��°�ڸ��� dist[3]=1�� �Է��� �������������ڸ� ���� �ڸ��� ������Ų��.
			}									// for������ ���ư��� i=2 if���� ����(0.7�� 0.0~2.1����)�ϸ� if�� ���� -> dat[1]�� 0.7 *10�ϸ� 7�̵ȴ�. dist[7]��° �ڸ��� 1��(7�� ���ڴ� 1��), 
											// ������������ ���� dist[]�� �ڸ����� �����ǰ� �ٽ� for������ �̵�...... dat[2]�� 2.0*1.0�ϸ� 20�̵ȴ�. dist[20]�� �ڸ��� 1���̴�. ������ -> �ٽ� for��....
											// �ݺ��ϸ� dist[] �迭�� �ϼ��ȴ�.(dist[]�� �ڸ����� �Է¾ȵ� �ڸ��� int�� �⺻�� 0�� ���� �Ǿ� ���ȴ�.)
		
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
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0),
				new PhyscData("ȫ����", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("�迵��", 174, 1.2),
				new PhyscData("�ڿ��", 169, 0.8),
	};
	int[] vdist = new int[VMAX]; // �÷º���
	
	System.out.println("---��ü �˻� ����Ʈ---");
	System.out.println("�̸�        Ű   �÷�");
	System.out.println("-------------------");
	for(int i=0; i<x.length; i++) // PhyscData�迭�� ���� 7-1 ��ŭ �ݺ�
		System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	
	System.out.printf("\n��� Ű:%5.1fcm\n", aveHeight(x));
	
	distVision(x, vdist); // �÷º���

	
	System.out.println("\n�÷� ����");
	for(int i=0; i<VMAX; i++)
		System.out.printf("%3.1f~:%2d��\n", i / 10.0, vdist[i]); // 0/10.0 = 0.0, 1/10.0= 0.1, 2/10.0= 0.2,.... vdist[i]�� �÷º��� �޼ҵ��� dist[]���� ���ϵǾ� �Բ� ��µȴ�. 
	}
}

