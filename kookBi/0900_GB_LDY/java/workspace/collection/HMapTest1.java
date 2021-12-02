package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		
//		HashMap�� ��� �߰��ϱ�
		dict.put("fly", "����");
		dict.put("walk", "�ȴ�");
		dict.put("run", "�ٴ�");
		
//		HashMap�� �����ϰ� ���� �ľ��ϱ�
		System.out.println(dict);
		
//		HashMap�� ��� �����ϱ�
//		������ �����ϴ� Key�� ���ο� Value�� �߰��ϸ� ������ �Ͼ��.
		dict.put("run", "�޸���");
		System.out.println(dict);
		
//		HashMap�� ��� �����ϱ�
//		System.out.println(dict.remove("run"));
//		System.out.println(dict);
		
//		dict.remove("run", "�޸���");
//		System.out.println(dict);
		
//		HashMap���� ��� ��������
		System.out.println(dict.get("walk"));
		
//		String[] keys = {"fly","walk","run"};
		Set<String> keyset = dict.keySet();
		Iterator<String> keyiter = keyset.iterator();
		
//					HashMap�� ��� ����(�� ���� �Ѱ��� ����)
		for (int i = 0; i < dict.size(); i++) {
			System.out.println("Ű : "+keyiter.next());
		}
		
		Collection<String> values = dict.values();
		Iterator<String> valueiter = values.iterator();
		
		Set<Entry<String, String>> entryset = dict.entrySet();
		Iterator<Entry<String, String>> entryiter = entryset.iterator();

		Entry<String,String> entry = entryiter.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}














