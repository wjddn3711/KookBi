package day04;

import java.util.Random;
import java.util.Scanner;

public class AnimalGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ÿ��Ʋ ���
		System.out.println("�ݽ�Ʈ�� �ִϸ� �����͢� (��_��)");
		//�÷����Ͻ� ������ ������
		//1. ������
		//2. �����
		//3. ����
		while(true) {
			System.out.println("�÷��� �Ͻ� ������ ������\n1. ������\n2. �����\n3. ����");
			int choice = sc.nextInt();
			
			int foodCnt = 0;
			int hp = 0;

			switch(choice) {
			case 1:
				foodCnt = 7;
				hp = 6;
				break;
			case 2:
				foodCnt = 5;
				hp = 8;
				break;
			case 3:
				foodCnt = 10;
				hp = 4;
				break;
			}
			
			//����� �̸��� :
			System.out.print("����� �̸��� : ");
			String name = sc.next();
			
			//---�ݺ�---
			//~~�� ȯ���մϴ�.
			//1. �Ա�
			//	���� 1 ���� / HP 2 ����
			//2. ���ڱ�
			//	HP 1����( 3�� )
			//3. ��å�ϱ�
			//	HP 1 ����
			//	������ ���� ���� *(���߸� ���� 2�� / Ʋ���� HP 1 �߰�����)
			//4. ������ ����
			//	�̸�, HP, ���̰��� �� ���
			//5. ������
			while(true) {
				System.out.println(name+"�� �÷�����...");
				System.out.println("1. �Ա�\n2. ���ڱ�\n3. ��å�ϱ�\n4. ������ ����\n5. ������");
				//������ ����
				//���� : �޸� 
				//���� : ������
				choice = sc.nextInt();
				if(choice == 5) {
					//������
					System.out.println("������ �ǿ�����~!");
					break;
				}
				switch(choice) {
				case 1:
					//�Ա�
					if(foodCnt>0) {
						foodCnt--;
						hp += 2;
						System.out.println(name+"��(��) ���̸� �԰� ü���� ȸ���߽��ϴ�...");
						System.out.println("���� hp : "+hp);
					}else {
						System.out.println("���̰� �����.. ��å�� ����������..");
					}
					break;
				case 2:
					//���ڱ�
					System.out.print("����.");
					for (int i = 0; i < 3; i++) {
						System.out.print(".");
						
						//Alt + Shift + Z > �� > Enter
						try {
//							Thread.sleep(1000) : 1000�и���(1��) ��� ���߱�
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					hp++;
					System.out.println();
					System.out.println("ü�� ȸ��!\n���� ü�� : "+hp);
					break;
				case 3:
					//��å�ϱ�
					if(hp == 1) {
						System.out.println("������ ��å�� �����⿡ �ʹ� �����ؿ�...(hp : 1)");
						break;
					}
					hp--;
					//���� ���� ����
					Random r = new Random();
					String quiz1 = "���� �� 9�� A������ ���� ������ �̸���?\n1. ������\n2. �۰�\n3. ���ټ�\n4. ������";
					String quiz2 = "���� �� �÷��� �����ӿ�ũ�� ������ �ʴ°���?\n1. ArrayList\n2. HashSet\n3. HttpServlet\n4. HashMap";
//					r.nextInt(n) : 0 ~ n-1 ������ ������ ����
//					r.nextInt(2) : 0, 1 �ΰ��߿� ������ ����
					int randNum = r.nextInt(2);
					if(randNum == 0) {
						System.out.println(quiz1);
					}else if(randNum == 1) {
						System.out.println(quiz2);
					}
					int answer = sc.nextInt();
					if(answer !=3) {
						System.out.println("�����̿���...");
						hp--;
					}else {
						System.out.println("�����̿���~!");
						foodCnt+=2;
					}
					break;
				case 4:
					//������ ����
					System.out.println("�רͨڨը٨ͨء�"+name+"�ڨͨڨը٨ͨء�");
					System.out.println("HP : "+hp);
					System.out.println("���� : "+foodCnt+"��\n");
					break;
				}
				if(hp == 0) {
					System.out.println(name+"(��)�� ���̻� �츮�� �Բ��� �� �����...");
					break;
				}
			}
		}
	}
}














