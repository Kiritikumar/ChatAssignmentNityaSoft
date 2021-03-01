package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FirstExample {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
		hs.add("java");
		hs.add("c");
		hs.add("python");
		hs.add("ruby");
		System.out.println(hs);
		System.out.println(hs.contains("c"));
		List<String> ls=new ArrayList<>(hs);
		Collections.sort(ls);
		System.out.println(ls);
	
	}

}
