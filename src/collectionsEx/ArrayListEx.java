package collectionsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// Write your code here
		List<String> al = new ArrayList<String>();
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		System.out.println("colors" + al);
		al.add(0, "pink");
		al.add(4, "yellow");
		System.out.println("colors" + al);
		al.set(2, "kumar");
		System.out.println("colors" + al);

		// System.out.println("color : " + s1);

		String s1 = al.get(2);

		System.out.println("color : " + s1);
		ArrayList<String> al1 = new ArrayList<String>(3);
		al1.add("0");
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.ensureCapacity(10);
		al1.add("4");
		al1.add("5");
		al1.add("6");
		al1.add("7");
//		    Collections.copy(al1, al);
		try {
			Collections.copy(al1, al);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("this is al" + al);
		System.out.println("copyes");
		String ta = "Taniikssha";
		String sa = "Sreyyansh";
		al.add(ta);
		al.add(sa);
		System.out.println("added" + al);
		System.out.println("thia is al1 copyed" + al1);
		Collections.shuffle(al1);
		System.out.println("Suffile" + al1);
		System.out.println("=======================================================");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		list.stream().filter(e -> e % 2 == 0).map(e -> e * 9 + " ").forEach(System.out::print);
		Collections.reverse(list);
		System.out.println();
		System.out.println("===========================================================");
		System.out.println(list);
		ArrayList<String> al2 = new ArrayList<String>();
//		for(String e : al1) {
//			al2.add(al1.contains(e) ? "yes": "no");
//			System.out.println(al2);
//		}
		Collections.swap(list, 0, 2);
		System.out.println(list);
		al2.addAll(al1);
		al2.addAll(al);
		System.out.println(al2);
		ArrayList<String> c1 = (ArrayList<String>) al1.clone();
		System.out.println("clone objects"+c1);
		c1.trimToSize();
		System.out.println("after trim "+ c1);
		c1.set(0, sa);
		c1.set(1, ta);
		System.out.println("after chenging values "+ c1);
		for(int i=0; i<c1.size();i++) {
			System.out.println(c1.get(i));
		}
	}
}
