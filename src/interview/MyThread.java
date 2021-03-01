package interview;


import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class MyThread {
//	static HashMap<Integer, String> m=new HashMap<Integer, String>();
	static ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<Integer, String>();
		public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("child thread updating Map ");
				m.put(103, "ddd");

			
		}
	public static void main(String[] args) throws InterruptedException {
		m.put(101, "aaa");
		m.put(102, "bbb");
		m.put(104, "ccc");
		MyThread t=new MyThread();
//		t.run();
//		t.start();
		Set s1=m.keySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Integer i1=(Integer) itr.next();
			System.out.println("Main Thread iterating and current thread "+i1+"------"+m.get(i1));
			Thread.sleep(1000);
		}
		System.out.println(m);
	}
}
