package day07;

public class Zoo {
	public static void main(String[] args) {
		//�̸�, ����, ����, ��
		//�Ա�, �ڱ�, �����̱�, ���
		//���� ������ ���� ����ϱ�
		Animal sphinx = new Animal("��ũ", 4521, "����", "����ũ��");
		Animal flea = new Animal("����", 1, "����","����");
		Animal tegu = new Animal("�����ڸ޽�", 34, "����", "�Ƹ���Ƽ���ױ�");
		
		sphinx.makeSomeNoise();
		flea.makeSomeNoise();
		tegu.makeSomeNoise();
		
		sphinx.move();
		flea.move();
		tegu.move();
	}

}
//ȸ��
//���� ���α׷����� ���ɸ��� Ŭ����
//K-���׿��� �ٹ��ϴ� ���� ��ߵǴ� Ŭ����

class Animal{
	String name;
	int age;
	String gender;
	String type;
	
	//Alt + Shift + S > O : �ʵ带 �̿��ؼ� ������ �����
	public Animal(String name, int age, String gender, String type) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}
	
	void eat() {
		System.out.println(name+"��(��) �ȳ� �Դ���...");
	}
	void sleep() {
		System.out.println(name+"��(��) ���� �ڴ���...");
	}
	void move() {
		System.out.println(name+"��(��) �������� �����̴���...");
	}
	void makeSomeNoise() {
		System.out.println(name+"��(��) ������̳���� �����...");
	}
}






