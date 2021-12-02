package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		int[] arData = {10,20,30,40,50};
		
//		for (int num : arData) {
//			System.out.println(num);
//		}
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(20);
		arList.add(30);
		arList.add(40);
		arList.add(50);
		
//		for (int data : arList) {
//			System.out.println(data);
//		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
//		for (Integer data : set) {
//			System.out.println(data);
//		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("하나", 1);
		map.put("둘", 2);
		map.put("셋", 3);
		map.put("넷", 4);
		map.put("다섯", 5);
	
		Set<Entry<String, Integer>> entryset = map.entrySet();
		for(Entry<String, Integer> entry : entryset) {
			System.out.println("키 : "+entry.getKey());
			System.out.println("값 : "+entry.getValue());
		}

	}
}













