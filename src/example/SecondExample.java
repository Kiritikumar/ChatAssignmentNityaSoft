package example;

import java.util.HashSet;
import java.util.TreeSet;

public class SecondExample {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
		hs.add("Java");
		hs.add("c");
		hs.add("dotNet");
		hs.add("mysql");
		hs.add("c++");
		System.out.println("before Sorting"+hs);
		for(String sorted : hs) {
			System.out.println(sorted);
		}
		TreeSet<String> ts=new TreeSet<>(hs);
		System.out.println("after sorting"+ts);
		System.out.println("is this list contain java "+ts.contains("Java"));
	}

}
