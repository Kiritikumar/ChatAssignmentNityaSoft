package collectionsEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();

		hs.add("pink");
		hs.add("orenge");
		hs.add("red");
		hs.add("blue");
		System.out.println(hs);
		Set<String> hs1 = new HashSet<String>();
		hs1.add("yellow");
		hs1.add("blue");
		hs1.add("green");
		hs1.add("black");
		System.out.println(hs1);
		hs.retainAll(hs1);
		System.out.println(hs);
		for (String elements : hs1) {
			System.out.println(hs.contains(elements)? "yes" : "no");
		}
		Set<String> rem = new HashSet<String>(hs1);
		System.out.println(rem);
		rem.clear();
//		rem.removeAll(rem);
		System.out.println(rem);

	}
}
