package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1���� 10���� ����ϱ�
//		10���� 1���� ����ϱ�
//		12���� 3�� �����ϸ� 13�� ����ϱ�
//		100 94 88 82 .... 28 ����ϱ�
//		1���� 10������ �� �� ���ϱ�
		int sum = 0;
//		sum += 1; //0+1
//		sum += 2; //0+1+2
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 10;
		for (int i = 1; i <= 10; i++) {
			//1 2 3 4 5 6 7 8 9 10
			sum += i;
		}
		System.out.println(sum);
//		n �ϳ� �Է¹޾Ƽ� 1���� n������ ���� ���ϱ�
//		for (int i = 1; i <= n; i++) {
//			+=i;
//		}
		
//		n, m �Է¹޾Ƽ� n���� m���� ����ϱ�
		System.out.print("n : ");
		int n = sc.nextInt();
		System.out.print("m : ");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}
//		1���� 100���� �� ¦���� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
//		1���� 100���� �� 3�� 5�� ������� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%5 == 0) {
				System.out.println(i);
			}
		}
//		3�� 5�� ������� �ƴ� ����
//		i%3!=0 || i%5!=0
//		!(i%3==0 && i%5 == 0)
		
//		1���� 100���� �� 3�� ����� 5�� ��� �� ������� �����ϰ� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			//if���� �����ٴ� ���� 3�� ����� 5�� ����� �ƴ϶�� ��
			if(i%3 == 0 || i%5 == 0) {
				//if�� �����ٴ� ���� 3�� 5�� �������� ��
				if(!(i%3==0 && i%5 == 0)) {
					System.out.println(i);
				}
				
			}
		}
//		A���� F���� ����ϱ�(�ƽ�Ű�ڵ� �̿�)
//		A:65 / F:70
		for (int i = 65; i < 71; i++) {
			System.out.println((char)i);
		}
		
//		0123...2425
//		AbCd....Yz ����ϱ�
		
//		A(65+0)	a(97) X
//		C(65+2)	b(97+1)
//		E(65+4)	d(97+3)
		String result = "";
		for (int i = 0; i < 26; i++) {
//			if(i%2 == 0) {
//				result += (char)(65+i);
//			}else {
//				result += (char)(97+i);
//			}
			result += (char)((i%2 == 0 ? 65 : 97)+i);
		}
		
		System.out.println(result);
		
//		��ø�ݺ��� ������� �ʰ� ������ ���� ����ϱ�
//		0   1  2  3  4  5  6  7  8	(1��) �� 0 / ������ 0 ~ 8
//		9  10 11 12 13 14 15 16 17  (2��) �� 1 / ������ 0 ~ 8
//		18 19 20 21 22 23 24 25 26  (3��)
//		...
//		for (int i = 0; i < 81; i++) {
//			int dan = i/9+1;
//			int gop = i%9+1;
//			
//			System.out.printf("%d X %d = %d\n",dan,gop,dan*gop);
//		}
		for (int i = 0; i < 90; i++) {
			int dan = i/10+1;
			int gop = i%10;
			
			if(gop == 0) {
				System.out.printf("�ڡ�-----%d��-----�١�\n",dan);
			}else {
				System.out.printf("%d X %d = %d\n",dan,gop,dan*gop);
			}
		}
//		10���� ���� �Է¹޾Ƽ� 2������ ����ϱ�
//		�����Ŀ� /= 2
		int num = 23;//10111
		String data = "";
		for (int i = num; i >=1; i/=2) {
			data = i%2+data;
		}
		System.out.println(data);
		
//		
//		ABCDefghIJKLmnopQRSTuvwxYZ ����ϱ�

//		4�� ���� �� Ȯ��
//		0 1 2 3		�빮�� 0
//		4 5 6 7		�ҹ��� 1
//		8 9 10 11	�빮�� 2
		result = "";
		for (int i = 0; i < 26; i++) {
			if((i/4)%2 == 0) {
				result += (char)(65+i);
			}else {
				result += (char)(97+i);
			}
		}
		System.out.println(result);
		
//		AbCDefGHIjklMNOPqrstUVWXYz ����ϱ�
		//caseType�� true���� ������ �ִ� : �빮�ڷ� ���
		//caseType�� false���� ������ �ִ� : �ҹ��ڷ� ���
		int cnt = 0;
		num = 1;
		boolean caseType = true;
		for (int i = 0; i < 26; i++) {
			if(cnt>=num){
				caseType = !caseType;
				cnt = 0;
				if(caseType == true) {
					num++;
				}
			}
			
			if(caseType == true) {
				System.out.print((char)(65+i));
			}else {
				System.out.print((char)(97+i));
			}
			cnt++;
			
			
		}
		
	}
}















