package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HSetTest2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(); 
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		Iterator<Integer> iter = set.iterator();
//		is~~~, has~~~ : ~~~ �̰ų�, ~~~�� ������ �ִٸ� true / �ƴ϶�� false
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter = set.iterator();
		System.out.println(iter.next());
	}
}













