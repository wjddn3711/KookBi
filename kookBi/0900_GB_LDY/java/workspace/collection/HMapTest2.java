package collection;

import java.util.HashMap;

public class HMapTest2 {
	public static void main(String[] args) {
		HashMap<User, Integer> users = new HashMap<User, Integer>();

		users.put(new User(1, "apple", "����"), 1000);
		users.put(new User(2, "banana","���ϳ�"), 2000);
		users.put(new User(3, "cherry","��ü��"), 3000);
		
//		HashMap, HashSet�� hashCode()�� �̿��ؼ� �� ��ü�� ���������� ��
		users.remove(new User(2, "banana","���ϳ�"));
		
		System.out.println(users);
	}
}
