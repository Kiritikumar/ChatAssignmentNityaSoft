package collectionsEx;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		System.out.println("executed");
		final List myList = new ArrayList();
		myList.add("India");

		System.out.println("list executed : " + myList);
		myList.remove(0);
		System.out.println("list executed after removed : " + myList);

		final List<String> list = new ArrayList<String>();
		final String str = "xyz";
		list.add("apple");
//str = "ball"; error
		System.out.println(list.get(0));
		System.out.println(str);
	}

}
