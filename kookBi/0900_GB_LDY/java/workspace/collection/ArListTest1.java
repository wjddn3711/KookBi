package collection;

import java.util.ArrayList;

public class ArListTest1 {
	public static void main(String[] args) {
		ArrayList<String> arData1 = new ArrayList<String>();
		ArrayList<Integer> arData2 = new ArrayList<Integer>();
		
		//ArrayList�� ��� �߰��ϱ�
		arData1.add("Hello");
		arData1.add("Collection!");
		arData1.add("So");
		arData1.add("Easy");
		
		//ArrayList ���� �����ϰ� �ľ��ϱ�
		System.out.println(arData1);
		
		//0��° �濡�� Hello
		//1��° �濡�� Collection!
		//..
		//					ArrayList�� ��� ����
		for (int i = 0; i < arData1.size(); i++) {
		//								ArrayList���� ��� ��������
			System.out.println(i+"��° �濡�� "+arData1.get(i));
		}
		//ArrayList�� ��� �����ϱ�
		arData1.set(3, "Hard");
		System.out.println(arData1);
		
		//ArrayList�� ��� �����ϱ�(��ҷ�, �ε�����)
//		arData1.remove("Hard");
		arData1.remove(3);
		System.out.println(arData1);
		
		arData2.add(10);
		arData2.add(20);
		arData2.add(30);
		arData2.add(40);
		arData2.add(50);
		
		System.out.println(arData2);
		
		arData2.remove(2);
		System.out.println(arData2);
		arData2.remove((Integer)50);
		System.out.println(arData2);
	}
}














