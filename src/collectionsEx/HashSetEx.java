package collectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("green");
		hs.add("red");
		hs.add("white");
		hs.add("black");
		System.out.println(hs);
//		System.out.println("is empty " + hs.isEmpty());
//		hs.removeAll(hs);
//		System.out.println("is empty " + hs.isEmpty());
		System.out.println(hs.size());
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("red");
		hs1.add("white");
		hs1.add("green");
		hs1.add("black");
		
		

		HashSet<String> hs2 =(HashSet<String>)hs.clone();
		System.out.println("clone  : "+hs1);
		System.out.println();
		System.err.println(hs);
		System.out.println(hs1);
		HashSet<String> compare = new HashSet<String>();

		for(String elements: hs) {
			System.out.println("comparing two HashSets "+compare.add(hs1.contains(elements)? "yes":"no"));
		}
		
		TreeSet<String> ts=new TreeSet<String>(hs);
		System.out.println("HashSet Converted to TreeSet "+ts );
		ArrayList<String> list = new ArrayList<String>(ts);
		System.out.println("HashSet Converted to TreeSet Converted to ArrayList "+list );
		

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String[] s=new String[hs.size()];
		hs.toArray(s);
		System.out.print(" array of strings : ");
		for(String s1 : s) {
			System.out.print(s1+", ");
		}
		
		
	}

}
