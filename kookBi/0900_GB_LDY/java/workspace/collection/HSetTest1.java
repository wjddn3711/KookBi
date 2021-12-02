package collection;

import java.util.HashSet;

public class HSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(); 
		
//		HashSet에 요소 추가하기
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
		
//		HashSet 간단하게 구조 파악하기
		System.out.println(set);
		
//		HashSet의 요소 개수
		System.out.println(set.size());
		
//		HashSet의 요소 포함 여부 확인하기
		System.out.println(set.contains(80));

//		HashSet의 요소 삭제하기
		set.remove(50);
		System.out.println(set);
		
		
	}
}








