package collection;

import java.util.HashSet;

public class HSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(); 
		
//		HashSet�� ��� �߰��ϱ�
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		
//		HashSet �����ϰ� ���� �ľ��ϱ�
		System.out.println(set);
		
//		HashSet�� ��� ����
		System.out.println(set.size());
		
//		HashSet�� ��� ���� ���� Ȯ���ϱ�
		System.out.println(set.contains(80));

//		HashSet�� ��� �����ϱ�
		set.remove(50);
		System.out.println(set);
		
		
	}
}








