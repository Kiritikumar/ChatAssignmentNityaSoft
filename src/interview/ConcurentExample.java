package interview;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurentExample {
public static void main(String[] args) {
		
		ConcurrentHashMap chm=new ConcurrentHashMap();
		chm.put(101,"hello");
		chm.put(102,"hi");
		chm.putIfAbsent(101, "replace");
		chm.putIfAbsent(103, "putIfAbsentIsWorked");
		chm.put(104, "alive");
		chm.remove(101,"aaa");
		chm.remove(104, "alive");
		chm.replace(102, "replaced");
		System.out.println(chm);
		
	}
}
