package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.println(name+"�� �������~");
		
		System.out.print("���� : ");
//		sc.nextDouble();
//		sc.nextFloat();
		int age = sc.nextInt();
		System.out.println("����� "+age+"���Դϴ�.");
	
		System.out.print("�ּ� : ");
		//���� nextInt() �������� ġ�� enter�� �Ծ� ġ��� ����
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("��°� : "+addr);
	}
}
