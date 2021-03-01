package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example4 {
	
//	public static void countDublicates(ArrayList<String> list) {
		public static void countDublicates(List<String> list) {
		Set<String> st = new TreeSet<String>(list);
		for (String s : st)
			System.out.println(s + ": " + Collections.frequency(list,s));
	}

	public static void main(String[] args) {
//
//		String[] names = { "java", "Spring", "Hibernat", "Bootsrap", "SpringBoot", "html", "java", "Spring", "java",
//				"java", "Hibernat" };
		
//		ArrayList<String> list = new ArrayList<String>();
//		for (String name : names) {
//			list.add(name);
//		}
		
		List<String> list = Arrays.asList("java", "Spring", "Hibernat", "Bootsrap", "SpringBoot", "html", "java", "Spring", "java",
				"java", "Hibernat");
		System.out.println(list);
		countDublicates(list);
	}

}