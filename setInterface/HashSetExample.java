package setInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	
	public void hashing() {
		
		Set<String> set = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("apple");
		ts.add("mango");
		ts.add("orange");
		
		lhs.add("cat");
		lhs.add("bat");
		lhs.add("rat");
		
		set.add("cat");
		set.add("bat");
		set.add("rat");
		
		System.out.println("Last item of the tree set : "+ ts.last());
		System.out.println(ts.first());

		System.out.println(lhs);
		Iterator<String> i = set.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
//		for (String st : set) {
//			System.out.println(st);
//		}
//		
	
//		
		
	}

}
