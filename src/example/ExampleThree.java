package example;

import java.util.HashSet;
import java.util.Set;

public class ExampleThree {

	public static void main(String[] args) {
		String[] names = { "java", "Spring", "Hibernat", "Bootsrap", "SpringBoot", "html", "java", "Spring", "java",
				"java", "Hibernat" };
		Set<String> duplicate = new HashSet<>();
		for (String name : names) {
			if (duplicate.add(name)==false) {
				System.out.println(name);
			}
		}
		
	}

}
