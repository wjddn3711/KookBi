package day03;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� �ʱ�ȭ (����:0, �Ǽ�:0.0, 0.0F, ����:' ',
//		���ڿ�:"", ����:���� false, �� ��:null)
		int num = 0;
		String result = "";
		
		System.out.print("���� : ");
		num = sc.nextInt();
		
//		result = num>0 ? "����Դϴ�." : "�����Դϴ�.";
//		result = num == 0 ? "0�Դϴ�." : result;
		result = num>0 ? "����Դϴ�." : num == 0 ? "0�Դϴ�" : "�����Դϴ�.";
		System.out.println(num+"��(��) "+result);
	}
}












