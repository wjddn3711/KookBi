package collection;

import java.util.ArrayList;

public class ArListTest2 {
	public static void main(String[] args) {
//		ArrayList<Integer> arData = new ArrayList<Integer>();
//		System.out.println(arData);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//		System.out.println(list);
//		각 데이터들이 담길 내부 리스트들 생성해서 추가
		list.add(new ArrayList<Integer>());
		list.add(new ArrayList<Integer>());
		
		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(30);
		list.get(1).add(40);
		list.get(1).add(50);
		list.get(1).add(60);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.println(list.get(i).get(j));
			}
		}
	}
}








