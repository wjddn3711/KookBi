package day03;

import java.util.Scanner;

//Ctrl + Shift + F : �ڵ� ����
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("���� �� ���α׷��� �� �ƴѰ���?\n1. C���\n2. Java\n3. ���վ�\n4. ���̽�");
		choice = sc.nextInt();
		switch (choice) {
		case 3:
			System.out.println("�����Դϴ�.");
			break;
		case 1:
		case 2:
		case 4:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}
}
